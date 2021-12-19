package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67484al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.e */
public final class C42453e {

    /* renamed from: a */
    public String f98943a;

    /* renamed from: b */
    public String f98944b;

    /* renamed from: c */
    public String f98945c = "";

    /* renamed from: d */
    public String f98946d;

    /* renamed from: e */
    public C67674b f98947e;

    /* renamed from: f */
    public boolean f98948f = true;

    /* renamed from: g */
    public int f98949g;

    /* renamed from: h */
    public int f98950h;

    /* renamed from: i */
    public String f98951i;

    /* renamed from: j */
    public boolean f98952j;

    /* renamed from: k */
    public String f98953k;

    /* renamed from: l */
    public String f98954l;

    /* renamed from: m */
    public boolean f98955m;

    /* renamed from: n */
    public long f98956n;

    /* renamed from: o */
    public String f98957o;

    /* renamed from: p */
    public C67678d f98958p;

    static {
        Covode.recordClassIndex(50401);
    }

    /* renamed from: a */
    public final boolean mo71665a() {
        if (this.f98950h != this.f98949g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71664a(String str) {
        C89219l.m154721d(str, "");
        this.f98945c = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo71663a(C67484al alVar) {
        C89219l.m154721d(alVar, "");
        String str = this.f98945c;
        String str2 = "search_sug";
        switch (str.hashCode()) {
            case -1816950631:
                if (str.equals("recom_search")) {
                    str2 = "recom_search";
                    break;
                }
                str2 = this.f98945c;
                break;
            case -1191929626:
                if (str.equals("related_search_keyword")) {
                    str2 = "related_search_keyword";
                    break;
                }
                str2 = this.f98945c;
                break;
            case -710131922:
                if (str.equals(str2)) {
                    alVar.mo106452c(C67484al.f151175u, this.f98951i);
                    break;
                }
                str2 = this.f98945c;
                break;
            case 3452698:
                if (str.equals("push")) {
                    str2 = this.f98953k;
                    break;
                }
                str2 = this.f98945c;
                break;
            default:
                str2 = this.f98945c;
                break;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = "normal_search";
        }
        alVar.mo106460p(str2);
    }
}
