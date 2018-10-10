/*
 * Copyright (c) 2002-2018, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.announce.business;

import fr.paris.lutece.plugins.genericattributes.business.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DTO for announces
 */
public class AnnounceDTO extends Announce
{
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -8507335801957930807L;
    private Map<Integer, List<Response>> _mapResponsesByIdEntry = new HashMap<Integer, List<Response>>( );

    /**
     * Default constructor
     */
    public AnnounceDTO( )
    {
        // Do nothing
    }

    /**
     * Creates a new announce DTO from an announce
     * 
     * @param announce
     *            The announce to read data from
     */
    public AnnounceDTO( Announce announce )
    {
        setId( announce.getId( ) );
        setCategory( announce.getCategory( ) );
        setContactInformation( announce.getContactInformation( ) );
        setDateCreation( announce.getDateCreation( ) );
        setDescription( announce.getDescription( ) );
        setHasPictures( announce.getHasPictures( ) );
        setPrice( announce.getPrice( ) );
        setPublished( announce.getPublished( ) );
        setSuspended( announce.getSuspended( ) );
        setSuspendedByUser( announce.getSuspendedByUser( ) );
        setTags( announce.getTags( ) );
        setListIdImageResponse( announce.getListIdImageResponse( ) );
        setTitle( announce.getTitle( ) );
        setUserName( announce.getUserName( ) );
    }

    /**
     * Get the map containing an association between entries of the form and the id of the associated entry
     * 
     * @return The map containing an association between entries of the form and the id of the associated entry
     */
    public Map<Integer, List<Response>> getMapResponsesByIdEntry( )
    {
        return _mapResponsesByIdEntry;
    }

    /**
     * Set the map containing an association between entries of the form and the id of the associated entry
     * 
     * @param mapResponsesByIdEntry
     *            The map
     */
    public void setMapResponsesByIdEntry( Map<Integer, List<Response>> mapResponsesByIdEntry )
    {
        this._mapResponsesByIdEntry = mapResponsesByIdEntry;
    }
}
