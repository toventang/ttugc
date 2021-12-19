package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.ad */
public final class C7371ad implements AbstractC7394l {

    /* renamed from: a */
    public final String f18270a;

    /* renamed from: b */
    public final Map<String, Object> f18271b;

    /* renamed from: c */
    private final AbstractC7394l.EnumC7395a f18272c;

    static {
        Covode.recordClassIndex(8138);
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f18270a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        AbstractC7394l.EnumC7395a aVar = this.f18272c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Map<String, Object> map = this.f18271b;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "SendBarrageEvent(content=" + this.f18270a + ", sender=" + this.f18272c + ", args=" + this.f18271b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7371ad)) {
            return false;
        }
        C7371ad adVar = (C7371ad) obj;
        if (!C89219l.m154714a((Object) this.f18270a, (Object) adVar.f18270a) || !C89219l.m154714a(this.f18272c, adVar.f18272c) || !C89219l.m154714a(this.f18271b, adVar.f18271b)) {
            return false;
        }
        return true;
    }

    public C7371ad(String str, AbstractC7394l.EnumC7395a aVar, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(map, "");
        this.f18270a = str;
        this.f18272c = aVar;
        this.f18271b = map;
    }
}
