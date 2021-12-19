package com.p2082ss.android.ugc.aweme.multi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.d */
public final class C60202d implements AbstractC60200b {

    /* renamed from: a */
    public final List<AbstractC60201c> f137229a;

    /* renamed from: b */
    public final Aweme f137230b;

    /* renamed from: c */
    private boolean f137231c = true;

    /* renamed from: d */
    private final Activity f137232d;

    /* renamed from: e */
    private final String f137233e;

    /* renamed from: f */
    private final String f137234f;

    /* renamed from: g */
    private final JSONObject f137235g;

    /* renamed from: h */
    private final AbstractC49691s<C49672ag> f137236h;

    /* renamed from: i */
    private final boolean f137237i;

    static {
        Covode.recordClassIndex(70731);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: b */
    public final Aweme mo97883b() {
        return this.f137230b;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: c */
    public final String mo97884c() {
        return this.f137233e;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: d */
    public final String mo97885d() {
        return this.f137234f;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: e */
    public final Activity mo97886e() {
        return this.f137232d;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: f */
    public final JSONObject mo97887f() {
        return this.f137235g;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: a */
    public final boolean mo97882a() {
        return this.f137231c;
    }

    /* renamed from: g */
    public final int mo97898g() {
        Iterator<T> it = this.f137229a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().mo97874d();
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60200b
    /* renamed from: a */
    public final void mo97881a(boolean z) {
        this.f137231c = z;
    }

    public C60202d(Aweme aweme, Activity activity, String str, String str2, JSONObject jSONObject, AbstractC49691s<C49672ag> sVar, boolean z) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(jSONObject, "");
        this.f137230b = aweme;
        this.f137232d = activity;
        this.f137233e = str;
        this.f137234f = str2;
        this.f137235g = jSONObject;
        this.f137236h = sVar;
        this.f137237i = z;
        this.f137229a = C60207h.m109761a(aweme, z, this);
    }
}
