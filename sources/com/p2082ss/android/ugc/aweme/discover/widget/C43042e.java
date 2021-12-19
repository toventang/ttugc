package com.p2082ss.android.ugc.aweme.discover.widget;

import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.AbstractC17278g;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.EnumC42835a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.e */
public final class C43042e extends ScrollView implements AbstractC17278g {

    /* renamed from: a */
    public static final C43043a f100348a = new C43043a((byte) 0);

    /* renamed from: b */
    private EnumC42835a f100349b;

    /* renamed from: c */
    private C17275e f100350c;

    /* renamed from: d */
    private C17273d f100351d;

    /* renamed from: e */
    private final int f100352e;

    static {
        Covode.recordClassIndex(51190);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.e$a */
    public static final class C43043a {
        static {
            Covode.recordClassIndex(51191);
        }

        private C43043a() {
        }

        public /* synthetic */ C43043a(byte b) {
            this();
        }
    }

    public final int getPageIndex() {
        return this.f100352e;
    }

    public final EnumC42835a getSearchStatusName() {
        return this.f100349b;
    }

    public final void setSearchStatusName(EnumC42835a aVar) {
        this.f100349b = aVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17278g
    public final void setStatus(C17273d dVar) {
        C89219l.m154721d(dVar, "");
        C17275e eVar = this.f100350c;
        if (eVar == null) {
            C89219l.m154710a("emptyDefaultView");
        }
        eVar.setStatus(dVar);
        this.f100351d = dVar;
    }
}
