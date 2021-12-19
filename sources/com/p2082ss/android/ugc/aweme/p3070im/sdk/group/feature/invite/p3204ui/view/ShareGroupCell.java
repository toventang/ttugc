package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.ShareGroupCell */
public final class ShareGroupCell extends PowerCell<C55382b> {
    static {
        Covode.recordClassIndex(65147);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.ShareGroupCell$a */
    static final class View$OnClickListenerC55379a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC55379a f126623a = new View$OnClickListenerC55379a();

        static {
            Covode.recordClassIndex(65148);
        }

        View$OnClickListenerC55379a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a = C55075a.m100721a();
            if (!(a instanceof RelationSelectActivity)) {
                a = null;
            }
            RelationSelectActivity relationSelectActivity = (RelationSelectActivity) a;
            if (relationSelectActivity != null) {
                relationSelectActivity.setResult(2098);
                relationSelectActivity.finish();
            }
            C54603a.m100109b("member_list");
            C54603a.m100114d();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a56, viewGroup, false);
        C89219l.m154716b(a, "");
        C23008e a2 = C23009f.m43397a(C55380b.f126624a);
        Context context = a.getContext();
        C89219l.m154716b(context, "");
        a.setBackground(a2.mo37389a(context));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.ShareGroupCell$b */
    static final class C55380b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C55380b f126624a = new C55380b();

        static {
            Covode.recordClassIndex(65149);
        }

        C55380b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54465d = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system2.getDisplayMetrics())));
            eVar2.f54467f = Integer.valueOf((int) R.attr.ao);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C55382b bVar) {
        String str;
        C55382b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(bVar2.f126628a);
        if (a != null) {
            C55357e.C55358a.m101168a();
            str = C55357e.m101163a(a);
        } else {
            str = null;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C34577e.m70608b((RemoteImageView) view.findViewById(R.id.on), str, -1, -1);
        this.itemView.setOnClickListener(View$OnClickListenerC55379a.f126623a);
    }
}
