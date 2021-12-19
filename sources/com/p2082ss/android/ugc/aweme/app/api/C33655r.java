package com.p2082ss.android.ugc.aweme.app.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33621d;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.C33618a;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.C33620c;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.app.api.r */
public final class C33655r extends AbstractC22043e.AbstractC22044a {

    /* renamed from: a */
    public AbstractC33621d f79851a;

    /* renamed from: b */
    private final C27910f f79852b;

    static {
        Covode.recordClassIndex(40548);
    }

    public C33655r(C27910f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        this.f79852b = fVar;
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == C33620c.class) {
                return new C33618a(parameterizedType, this.f79852b, this.f79851a);
            }
            return null;
        } else if (!(type instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new C33654q(ProtoAdapter.get(cls));
        }
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C33653p(ProtoAdapter.get(cls));
    }
}
