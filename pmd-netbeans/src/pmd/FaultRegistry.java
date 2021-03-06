/*
 *  Copyright (c) 2002-2003, the pmd-netbeans team
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification,
 *  are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR
 *  ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 *  LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 *  OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 *  DAMAGE.
 */
package pmd;

import java.util.HashMap;
import java.util.Map;
import org.openide.loaders.DataObject;

/**
 * A register holding all the faults the pmd finds. Used to lookup the correct
 * file and line-within-file at which each fault was found.
 */
public class FaultRegistry {

	/** The registered faults */
	private Map<String, DataObject> faults = new HashMap<String, DataObject>();
	
	/** The singleton instance of this class. */
	private static FaultRegistry instance = new FaultRegistry();
	
	/** Private constructor; this is a singleton class. */
	private FaultRegistry() {}
	
	/** Returns the singleton instance of this class. */
	public static FaultRegistry getInstance() {
		return instance;
	}

	/**
	 * Returns the associated dataobject
	 *
	 * @param key the value of the fault
	 * @return the associated dataobject
	 * @see pmd.Fault#getFault()
	 */
	public DataObject getDataObject( String key ) {
		return ( DataObject )faults.get( key );
	}


	/** Clears all entries of the registry  */
	public void clearRegistry() {
		faults.clear();
	}


	/**
	 * Register a new fault
	 *
	 * @param fault the fault that's used as key
	 * @param object the object where the fault is
	 * @see pmd.Fault#getFault()
	 */
	public void registerFault( Fault fault, DataObject object ) {
		faults.put( fault.getFault(), object );
	}
}
