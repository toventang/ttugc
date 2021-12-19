package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.p060l.AbstractC1134m;
import androidx.p060l.C1098c;
import androidx.p060l.C1142o;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af */
public final class C38622af {

    /* renamed from: a */
    public static final int f91275a = R.id.g1;

    /* renamed from: b */
    public static final C38622af f91276b = new C38622af();

    private C38622af() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af$b */
    public static final class RunnableC38624b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f91278a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f91279b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f91280c;

        static {
            Covode.recordClassIndex(46165);
        }

        public RunnableC38624b(View view, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f91278a = view;
            this.f91279b = viewGroup;
            this.f91280c = viewGroup2;
        }

        public final void run() {
            C38622af.m78383a(this.f91279b, this.f91280c, this.f91278a);
        }
    }

    static {
        Covode.recordClassIndex(46163);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.af$a */
    public static final class C38623a extends AbstractC89220m implements AbstractC89172b<Integer, View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f91277a;

        static {
            Covode.recordClassIndex(46164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38623a(ViewGroup viewGroup) {
            super(1);
            this.f91277a = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(Integer num) {
            return this.f91277a.getChildAt(num.intValue());
        }
    }

    /* renamed from: b */
    public static AbstractC89306h<View> m78384b(ViewGroup viewGroup) {
        return C89309k.m154810e(C89070n.m154598r(C89271h.m154766a(0, viewGroup.getChildCount())), new C38623a(viewGroup));
    }

    /* renamed from: a */
    public static final void m78382a(ViewGroup viewGroup) {
        int i;
        if (viewGroup != null) {
            Iterator a = C89309k.m154809e(m78384b(viewGroup)).mo2926a();
            while (true) {
                i = 8;
                if (!a.hasNext()) {
                    break;
                }
                View view = (View) a.next();
                Object tag = view.getTag(f91275a);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l == null || l.longValue() <= 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
            }
            Iterator<View> a2 = m78384b(viewGroup).mo2926a();
            while (true) {
                if (a2.hasNext()) {
                    if (a2.next().getVisibility() == 0) {
                        i = 0;
                        break;
                    }
                } else {
                    break;
                }
            }
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static final void m78381a(View view, AwemeTextLabelModel awemeTextLabelModel) {
        long j;
        if (view != null) {
            if (awemeTextLabelModel != null) {
                j = C89241a.m154731b((double) (awemeTextLabelModel.getShowSeconds() * 1000.0f));
            } else {
                j = 0;
            }
            view.setTag(f91275a, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static void m78383a(ViewGroup viewGroup, View view, View view2) {
        long j;
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        if (view2.getVisibility() != 0) {
            Object tag = view2.getTag(f91275a);
            if (!(tag instanceof Long)) {
                tag = null;
            }
            Long l = (Long) tag;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            view2.setVisibility(0);
            if (j <= 0 || view.getVisibility() != 0) {
                view2.setAlpha(1.0f);
                AbstractC1134m[] mVarArr = {new C1098c()};
                if (viewGroup != null) {
                    try {
                        C1142o.m3795a(viewGroup, mVarArr[0]);
                    } catch (NullPointerException unused) {
                    }
                }
                view.setVisibility(0);
                return;
            }
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(200).start();
        }
    }
}
