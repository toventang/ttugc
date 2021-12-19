package com.squareup.wire;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.util.HashMap;
import java.util.Map;
import p4632k.C89427i;

public final class WireTypeAdapterFactory implements AbstractC28033w {
    private final Map<Class, Pair<Message, WireDeserializeErrorListener>> defaultValue = new HashMap();

    static {
        Covode.recordClassIndex(35715);
    }

    public final void registerDefaultValue(Message message, WireDeserializeErrorListener wireDeserializeErrorListener) {
        this.defaultValue.put(message.getClass(), new Pair<>(message, wireDeserializeErrorListener));
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        if (cls.equals(C89427i.class)) {
            return new ByteStringTypeAdapter();
        }
        Pair<Message, WireDeserializeErrorListener> pair = this.defaultValue.get(cls);
        if (pair != null) {
            return new DefaultValueMessageTypeAdapter(fVar, aVar, "", (Message) pair.first, (WireDeserializeErrorListener) pair.second);
        }
        if (Message.class.isAssignableFrom(cls)) {
            return new MessageTypeAdapter(fVar, aVar);
        }
        return null;
    }
}
