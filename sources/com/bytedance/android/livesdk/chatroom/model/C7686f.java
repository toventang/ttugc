package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.f */
public final class C7686f {

    /* renamed from: a */
    public boolean f19036a;

    /* renamed from: b */
    public boolean f19037b;

    /* renamed from: c */
    public boolean f19038c;

    /* renamed from: d */
    public boolean f19039d = true;

    /* renamed from: e */
    public String f19040e;

    /* renamed from: f */
    public boolean f19041f = true;

    /* renamed from: g */
    public boolean f19042g;

    /* renamed from: h */
    public boolean f19043h;

    /* renamed from: i */
    public final List<EmoteModel> f19044i = new ArrayList();

    static {
        Covode.recordClassIndex(8468);
    }

    /* renamed from: a */
    public final void mo13912a(List<EmoteModel> list) {
        this.f19044i.clear();
        if (list != null && !list.isEmpty()) {
            this.f19044i.addAll(list);
        }
    }
}
