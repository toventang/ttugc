package com.bytedance.android.live.publicscreen.p386a.p390d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.d.j */
public abstract class AbstractC5876j<MESSAGE extends AbstractC6571a> extends AbstractC5877k<MESSAGE> {
    static {
        Covode.recordClassIndex(6483);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public User mo10375b() {
        return null;
    }

    /* renamed from: s */
    public abstract ImageModel mo11693s();

    /* renamed from: t */
    public abstract int mo11694t();

    /* renamed from: u */
    public ImageModel mo11695u() {
        return null;
    }

    /* renamed from: v */
    public abstract boolean mo11696v();

    /* renamed from: w */
    public void mo11697w() {
    }

    /* renamed from: x */
    public String mo11698x() {
        return "#ff4e33";
    }

    /* renamed from: y */
    public ImageModel mo11699y() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5876j(MESSAGE message) {
        super(message);
        C89219l.m154721d(message, "");
    }
}
