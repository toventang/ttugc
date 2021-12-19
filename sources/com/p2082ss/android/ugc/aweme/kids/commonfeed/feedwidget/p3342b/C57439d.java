package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.d */
public final class C57439d {

    /* renamed from: b */
    public static final C57440a f130960b = new C57440a((byte) 0);

    /* renamed from: a */
    public C23226a f130961a;

    /* renamed from: c */
    private final LinearLayout f130962c;

    /* renamed from: d */
    private final List<AnchorCommonStruct> f130963d;

    static {
        Covode.recordClassIndex(67368);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.d$a */
    public static final class C57440a {
        static {
            Covode.recordClassIndex(67369);
        }

        private C57440a() {
        }

        public /* synthetic */ C57440a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.d$b */
    static final class C57441b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57439d f130964a;

        static {
            Covode.recordClassIndex(67370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57441b(C57439d dVar) {
            super(0);
            this.f130964a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f130964a.f130961a.dismiss();
            return C89391z.f203057a;
        }
    }

    public C57439d(Context context, List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        UrlModel icon;
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        MethodCollector.m26663i(7055);
        this.f130963d = list;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        for (AnchorCommonStruct anchorCommonStruct : list) {
            C57438c cVar = new C57438c(context, (byte) 0);
            List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
            if (!(actions == null || (anchorPanelAction = actions.get(0)) == null || (icon = anchorPanelAction.getIcon()) == null)) {
                C34602l a = C34735v.m70965a(icon);
                C89219l.m154716b(a, "");
                cVar.setActionIcon(a);
            }
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                C34602l a2 = C34735v.m70965a(thumbnail);
                C89219l.m154716b(a2, "");
                cVar.setIcon(a2);
            }
            cVar.setTitle(anchorCommonStruct.getKeyword());
            cVar.setSubtitle(anchorCommonStruct.getDescription());
            linearLayout.addView(cVar);
        }
        this.f130962c = linearLayout;
        C23226a.C23227a b = new C23226a.C23227a().mo37816a(linearLayout).mo37822b(true).mo37824c(true).mo37820b().mo37821b(linearLayout.getHeight());
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23187b a3 = new C23187b().mo37738a(R.raw.icon_x_mark);
        a3.f54930b = true;
        TuxNavBar.C23179a a4 = aVar.mo37732a(a3.mo37741a((AbstractC89171a<C89391z>) new C57441b(this)));
        C23194g gVar = new C23194g();
        String string = context.getString(R.string.cs4);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a5 = a4.mo37731a(gVar.mo37753a(string));
        a5.f54919d = true;
        this.f130961a = b.mo37818a(a5).f55057a;
        MethodCollector.m26664o(7055);
    }
}
