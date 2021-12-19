package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.af */
public final class C7373af implements AbstractC7394l {

    /* renamed from: a */
    public final List<EmoteModel> f18275a;

    /* renamed from: b */
    private final AbstractC7394l.EnumC7395a f18276b;

    /* renamed from: c */
    private final Map<String, Object> f18277c;

    static {
        Covode.recordClassIndex(8140);
    }

    public final int hashCode() {
        int i;
        int i2;
        List<EmoteModel> list = this.f18275a;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        AbstractC7394l.EnumC7395a aVar = this.f18276b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Map<String, Object> map = this.f18277c;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "SendEmoteEvent(emotes=" + this.f18275a + ", sender=" + this.f18276b + ", args=" + this.f18277c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7373af)) {
            return false;
        }
        C7373af afVar = (C7373af) obj;
        if (!C89219l.m154714a(this.f18275a, afVar.f18275a) || !C89219l.m154714a(this.f18276b, afVar.f18276b) || !C89219l.m154714a(this.f18277c, afVar.f18277c)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.emoji.EmoteModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7373af(List<? extends EmoteModel> list, AbstractC7394l.EnumC7395a aVar, Map<String, ? extends Object> map) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(map, "");
        this.f18275a = list;
        this.f18276b = aVar;
        this.f18277c = map;
    }
}
