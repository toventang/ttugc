package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.ContactSquareCell */
public class ContactSquareCell extends PermissionSquareCell<C74806a> {
    static {
        Covode.recordClassIndex(87640);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    /* renamed from: a */
    public final void mo117850a(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        super.mo117850a(tuxTextView);
        tuxTextView.setText(R.string.atc);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    /* renamed from: b */
    public final void mo117851b(TuxTextView tuxTextView) {
        C89219l.m154721d(tuxTextView, "");
        super.mo117851b(tuxTextView);
        tuxTextView.setText(R.string.atb);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell, com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell
    /* renamed from: a */
    public void mo117848a(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
        super.mo117848a(tuxIconView);
        tuxIconView.setTuxIcon(C23005c.m43393a(C74793a.f168107a));
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.ContactSquareCell$a */
    static final class C74793a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C74793a f168107a = new C74793a();

        static {
            Covode.recordClassIndex(87641);
        }

        C74793a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_color_contact_circle;
            return C89391z.f203057a;
        }
    }
}
