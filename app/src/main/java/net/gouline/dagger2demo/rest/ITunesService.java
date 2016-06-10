package net.gouline.dagger2demo.rest;

import net.gouline.dagger2demo.model.ITunesResultSet;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * iTunes service.
 * <p/>
 * Created by mgouline on 23/04/15.
 */
public interface ITunesService {
    @GET("search")
    Observable<ITunesResultSet> search(@Query("term") String term,
                                       @Query("entity") String entity);
}
