package com.p2082ss.android.ugc.aweme.ufr;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.a */
public abstract class AbstractC79495a {

    /* renamed from: a */
    protected Context f178432a;

    /* renamed from: b */
    protected String f178433b;

    /* renamed from: c */
    protected String f178434c;

    /* renamed from: d */
    protected String f178435d;

    /* renamed from: e */
    public Map<String, String> f178436e;

    /* renamed from: f */
    public boolean f178437f;

    /* renamed from: g */
    public boolean f178438g = true;

    static {
        Covode.recordClassIndex(92698);
    }

    /* renamed from: a */
    public abstract AbstractC88979t<C79547e> mo123072a(boolean z, int i);

    /* renamed from: e */
    public abstract AbstractC88979t<C79547e> mo123077e();

    /* renamed from: f */
    public abstract AbstractC88979t<C79547e> mo123078f();

    /* renamed from: g */
    public abstract AbstractC88979t<C79547e> mo123079g();

    /* renamed from: h */
    public abstract AbstractC88979t<C79547e> mo123080h();

    /* renamed from: i */
    public abstract AbstractC88979t<C79547e> mo123081i();

    /* renamed from: b */
    public final String mo123074b() {
        String str = this.f178433b;
        if (str == null) {
            C89219l.m154710a("uid");
        }
        return str;
    }

    /* renamed from: c */
    public final String mo123075c() {
        String str = this.f178434c;
        if (str == null) {
            C89219l.m154710a("enterFrom");
        }
        return str;
    }

    /* renamed from: d */
    public final String mo123076d() {
        String str = this.f178435d;
        if (str == null) {
            C89219l.m154710a("enterMethod");
        }
        return str;
    }

    /* renamed from: a */
    public final Context mo123071a() {
        Context context = this.f178432a;
        if (context == null) {
            C89219l.m154710a("context");
        }
        return context;
    }

    /* renamed from: a */
    public final void mo123073a(Context context, String str, String str2, String str3, boolean z, boolean z2, Map<String, String> map) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f178432a = context;
        this.f178433b = str;
        this.f178434c = str2;
        this.f178435d = str3;
        this.f178437f = z;
        this.f178438g = z2;
        this.f178436e = map;
    }
}
