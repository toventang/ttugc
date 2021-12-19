package com.p2082ss.android.ugc.aweme.video.simpreloader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.i */
public final class C81062i implements AbstractC81061h {

    /* renamed from: a */
    public final String f181179a;

    /* renamed from: b */
    public final ArrayList<C81055d> f181180b;

    /* renamed from: c */
    private int f181181c;

    /* renamed from: d */
    private int f181182d;

    /* renamed from: e */
    private String f181183e;

    static {
        Covode.recordClassIndex(94383);
    }

    public C81062i() {
        this(null, null, 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simpreloader.AbstractC81061h
    /* renamed from: b */
    public final void mo124519b() {
        this.f181180b.size();
        mo124524e();
        this.f181180b.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simpreloader.AbstractC81061h
    /* renamed from: a */
    public final void mo124518a() {
        int i = this.f181182d;
        if (i != -1) {
            int i2 = i + 1;
            this.f181182d = i2;
            if (i2 >= this.f181180b.size() || (this.f181182d - this.f181181c) + 1 > C81067m.f181187d.f180770d) {
                this.f181180b.size();
                mo124524e();
                this.f181180b.size();
                return;
            }
            this.f181180b.get(this.f181182d).mo124516a();
        }
    }

    /* renamed from: c */
    public final void mo124522c() {
        this.f181181c = -1;
        this.f181182d = -1;
        this.f181183e = "";
        for (T t : this.f181180b) {
            AbstractC24157c<Void> cVar = t.f181175b;
            if (cVar != null) {
                cVar.mo39750g();
            }
            t.f181175b = null;
            Aweme aweme = t.f181176c.get();
            if (aweme != null) {
                aweme.getAid();
            }
        }
    }

    /* renamed from: d */
    public final void mo124523d() {
        this.f181181c = -1;
        this.f181182d = -1;
        this.f181183e = "";
        Iterator<T> it = this.f181180b.iterator();
        while (it.hasNext()) {
            it.next().mo124517b();
        }
        this.f181180b.clear();
    }

    /* renamed from: e */
    public final void mo124524e() {
        if (this.f181180b.size() > 0) {
            for (int size = this.f181180b.size() - 1; size >= 0; size--) {
                if (this.f181180b.get(size).f181176c.get() == null) {
                    this.f181180b.remove(size);
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo124521b(String str) {
        String str2;
        C89219l.m154721d(str, "");
        int size = this.f181180b.size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = this.f181180b.get(i).f181176c.get();
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo124520a(String str) {
        C89219l.m154721d(str, "");
        int b = mo124521b(str);
        if (b >= 0 && !C89219l.m154714a((Object) this.f181183e, (Object) str)) {
            this.f181183e = str;
            int i = b;
            do {
                this.f181180b.get(i).mo124517b();
                if (i < b) {
                    this.f181180b.remove(i);
                }
                i--;
            } while (i >= 0);
            this.f181181c = b;
            int i2 = b + 1;
            this.f181181c = i2;
            this.f181182d = i2;
            if (i2 < this.f181180b.size()) {
                this.f181180b.get(this.f181182d).mo124516a();
            }
        }
    }

    private C81062i(String str, ArrayList<C81055d> arrayList) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(arrayList, "");
        this.f181179a = str;
        this.f181180b = arrayList;
        this.f181181c = -1;
        this.f181182d = -1;
        this.f181183e = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C81062i(String str, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
