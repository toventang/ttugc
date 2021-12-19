package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mob.C42446a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.r */
public final class C42906r extends AbstractC0975m {

    /* renamed from: d */
    public static final C42907a f100050d = new C42907a((byte) 0);

    /* renamed from: a */
    public final List<AbstractC42874l> f100051a = new ArrayList();

    /* renamed from: b */
    public int f100052b = -1;

    /* renamed from: c */
    public final Context f100053c;

    /* renamed from: e */
    private int f100054e = -1;

    /* renamed from: f */
    private int f100055f = -1;

    static {
        Covode.recordClassIndex(51011);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.r$a */
    public static final class C42907a {
        static {
            Covode.recordClassIndex(51012);
        }

        private C42907a() {
        }

        public /* synthetic */ C42907a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC42874l mo73129a() {
        return mo73131b(this.f100055f);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f100051a.size();
    }

    /* renamed from: b */
    public final void mo73132b() {
        if (this.f100055f < 0) {
            mo73133c(0);
        }
        AbstractC42874l b = mo73131b(this.f100055f);
        if (b != null) {
            mo73130a(b, true);
        }
    }

    /* renamed from: c */
    public final void mo73133c(int i) {
        this.f100054e = this.f100055f;
        this.f100055f = i;
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        AbstractC42874l b = mo73131b(i);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    /* renamed from: b */
    public final AbstractC42874l mo73131b(int i) {
        return this.f100051a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        AbstractC42874l b = mo73131b(i);
        if (b == null) {
            C89219l.m154715b();
        }
        if (b.mo73059b() != 0) {
            Context context = this.f100053c;
            AbstractC42874l b2 = mo73131b(i);
            if (b2 == null) {
                C89219l.m154715b();
            }
            String string = context.getString(b2.mo73059b());
            C89219l.m154716b(string, "");
            return string;
        }
        AbstractC42874l b3 = mo73131b(i);
        if (b3 == null) {
            C89219l.m154715b();
        }
        return String.valueOf(b3.f99973b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42906r(Context context, AbstractC0952i iVar) {
        super(iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f100053c = context;
    }

    /* renamed from: a */
    public final void mo73130a(AbstractC42874l lVar, boolean z) {
        String str;
        C89219l.m154721d(lVar, "");
        String c = lVar.mo73060c();
        if (z) {
            C42446a.m84854a(c, "default_landing_page", "default_landing_page");
            return;
        }
        AbstractC42874l b = mo73131b(this.f100054e);
        if (b != null) {
            String c2 = b.mo73060c();
            if (this.f100055f == this.f100052b) {
                str = "click";
            } else {
                this.f100052b = -1;
                str = "slide";
            }
            C42446a.m84854a(c, c2, str);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
        this.f100051a.remove(i);
        notifyDataSetChanged();
    }
}
