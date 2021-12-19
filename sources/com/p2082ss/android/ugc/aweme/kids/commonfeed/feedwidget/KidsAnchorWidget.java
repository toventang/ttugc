package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.C57439d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget */
public final class KidsAnchorWidget extends AbsFeedWidget {

    /* renamed from: a */
    public static final C57424a f130911a = new C57424a((byte) 0);

    static {
        Covode.recordClassIndex(67349);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget$a */
    public static final class C57424a {
        static {
            Covode.recordClassIndex(67350);
        }

        private C57424a() {
        }

        public /* synthetic */ C57424a(byte b) {
            this();
        }

        /* renamed from: a */
        static boolean m104067a(AnchorCommonStruct anchorCommonStruct) {
            List<AnchorPanelAction> actions;
            if (anchorCommonStruct.getType() == 28 && (actions = anchorCommonStruct.getActions()) != null) {
                Iterator<T> it = actions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getActionType() == 1) {
                        if (next != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m104068a(Aweme aweme) {
            List<AnchorCommonStruct> anchors;
            if (!(aweme == null || (anchors = aweme.getAnchors()) == null || ((anchors instanceof Collection) && anchors.isEmpty()))) {
                for (T t : anchors) {
                    C89219l.m154716b(t, "");
                    if (m104067a((AnchorCommonStruct) t)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57425b(view, view);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget$b */
    public static final class C57425b extends AbstractC57436a {

        /* renamed from: a */
        final /* synthetic */ View f130912a;

        /* renamed from: b */
        private TuxTextView f130913b;

        /* renamed from: c */
        private SmartImageView f130914c;

        /* renamed from: j */
        private TuxTextView f130915j;

        /* renamed from: k */
        private TuxIconView f130916k;

        /* renamed from: l */
        private View f130917l;

        static {
            Covode.recordClassIndex(67351);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "anchor";
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget$b$a */
        static final class View$OnClickListenerC57426a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57425b f130918a;

            /* renamed from: b */
            final /* synthetic */ List f130919b;

            /* renamed from: c */
            final /* synthetic */ AbstractC0952i f130920c;

            static {
                Covode.recordClassIndex(67352);
            }

            View$OnClickListenerC57426a(C57425b bVar, List list, AbstractC0952i iVar) {
                this.f130918a = bVar;
                this.f130919b = list;
                this.f130920c = iVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f130918a.mo94698a(this.f130919b, this.f130920c);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            TuxTextView tuxTextView;
            SmartImageView smartImageView;
            TuxTextView tuxTextView2;
            MethodCollector.m26663i(7389);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                TuxIconView tuxIconView = null;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.acs, (ViewGroup) null);
                this.f130917l = inflate;
                if (inflate != null) {
                    tuxTextView = (TuxTextView) inflate.findViewById(R.id.c2d);
                } else {
                    tuxTextView = null;
                }
                this.f130913b = tuxTextView;
                View view2 = this.f130917l;
                if (view2 != null) {
                    smartImageView = (SmartImageView) view2.findViewById(R.id.c2b);
                } else {
                    smartImageView = null;
                }
                this.f130914c = smartImageView;
                View view3 = this.f130917l;
                if (view3 != null) {
                    tuxTextView2 = (TuxTextView) view3.findViewById(R.id.c2e);
                } else {
                    tuxTextView2 = null;
                }
                this.f130915j = tuxTextView2;
                View view4 = this.f130917l;
                if (view4 != null) {
                    tuxIconView = (TuxIconView) view4.findViewById(R.id.c2c);
                }
                this.f130916k = tuxIconView;
                viewGroup.addView(this.f130917l);
            }
            MethodCollector.m26664o(7389);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
            if (r3 == null) goto L_0x003b;
         */
        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo94691a(com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a r8) {
            /*
            // Method dump skipped, instructions count: 228
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget.C57425b.mo94691a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57425b(View view, View view2) {
            super(view2);
            this.f130912a = view;
        }

        /* renamed from: a */
        public final void mo94698a(List<AnchorCommonStruct> list, AbstractC0952i iVar) {
            if (list != null && !list.isEmpty() && list.size() > 1) {
                View view = this.f130953g;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                new C57439d(context, list).f130961a.show(iVar, "KidsAnchorSelectionSheet");
            }
        }
    }
}
