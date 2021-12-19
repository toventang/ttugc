package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements AbstractC28033w {
    static {
        Covode.recordClassIndex(33541);
    }

    TypeAdapters$26() {
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        if (aVar.rawType != Timestamp.class) {
            return null;
        }
        final AbstractC28031v<T> a = fVar.mo46665a((Class) Date.class);
        return new AbstractC28031v<Timestamp>() {
            /* class com.google.gson.internal.bind.TypeAdapters$26.C279351 */

            static {
                Covode.recordClassIndex(33542);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.google.gson.AbstractC28031v
            public final /* synthetic */ Timestamp read(C27897a aVar) {
                Date date = (Date) a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
            @Override // com.google.gson.AbstractC28031v
            public final /* bridge */ /* synthetic */ void write(C27900c cVar, Timestamp timestamp) {
                a.write(cVar, timestamp);
            }
        };
    }
}
