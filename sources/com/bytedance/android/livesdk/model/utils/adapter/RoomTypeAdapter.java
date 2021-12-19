package com.bytedance.android.livesdk.model.utils.adapter;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import java.lang.reflect.Type;

public class RoomTypeAdapter implements AbstractC28018k<Room> {
    static {
        Covode.recordClassIndex(11458);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ Room mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        Room room = (Room) C4139e.C4140a.f11576c.mo46668a(lVar, type);
        room.init();
        return room;
    }
}
