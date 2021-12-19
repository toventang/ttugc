package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import android.content.res.Resources;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell */
public final class RecUserSquareCell extends RecommendUserCell<C74825a> {

    /* renamed from: a */
    public static int f168155a;

    /* renamed from: b */
    public static int f168156b = 1;

    /* renamed from: j */
    public static final Paint f168157j;

    /* renamed from: k */
    public static final C74819a f168158k = new C74819a((byte) 0);

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final int mo117868a() {
        return R.layout.b0_;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell$a */
    public static final class C74819a {
        static {
            Covode.recordClassIndex(87676);
        }

        private C74819a() {
        }

        public /* synthetic */ C74819a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m131378a(List<? extends User> list) {
            String quantityString;
            List<MutualUser> userList;
            C89219l.m154721d(list, "");
            RecUserSquareCell.f168156b = 1;
            for (T t : list) {
                if (t.getMutualStruct() == null) {
                    quantityString = t.getRecommendReason();
                } else {
                    List<MutualUser> userList2 = t.getMutualStruct().getUserList();
                    if (userList2 == null || userList2.isEmpty()) {
                        quantityString = C17867d.m33078a().getResources().getQuantityString(R.plurals.fa, t.getMutualStruct().getTotal(), Integer.valueOf(t.getMutualStruct().getTotal()));
                        C89219l.m154716b(quantityString, "");
                    } else {
                        quantityString = MutualRelationView.C81410a.m141133a(C17867d.m33078a(), Integer.valueOf(t.getMutualStruct().getMutualType()));
                    }
                }
                float measureText = RecUserSquareCell.f168157j.measureText(quantityString);
                if (!(t.getMutualStruct() == null || (userList = t.getMutualStruct().getUserList()) == null || userList.isEmpty())) {
                    MutualStruct mutualStruct = t.getMutualStruct();
                    C89219l.m154716b(mutualStruct, "");
                    float a = SuggestUserAvatarView.C81421a.m141180a(mutualStruct);
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    measureText += (float) C89241a.m154730a(TypedValue.applyDimension(1, a, system.getDisplayMetrics()));
                }
                int i = RecUserSquareCell.f168156b;
                double d = (double) measureText;
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                double a2 = (double) C89241a.m154730a(TypedValue.applyDimension(1, 114.0f, system2.getDisplayMetrics()));
                Double.isNaN(d);
                Double.isNaN(a2);
                RecUserSquareCell.f168156b = Math.max(i, (int) Math.ceil(d / a2));
            }
            RecUserSquareCell.f168156b = Math.min(2, RecUserSquareCell.f168156b);
            float f = (float) (((RecUserSquareCell.f168156b - 1) * 14) + 176);
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            int a3 = C89241a.m154730a(TypedValue.applyDimension(1, f, system3.getDisplayMetrics()));
            RecUserSquareCell.f168155a = a3;
            return a3;
        }
    }

    static {
        Covode.recordClassIndex(87675);
        Paint paint = new Paint();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        paint.setTextSize(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        f168157j = paint;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final void mo117875a(View view) {
        C89219l.m154721d(view, "");
        super.mo117875a(view);
        if (f168155a != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = f168155a;
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final void mo117869a(User user, FollowButtonWithBlock followButtonWithBlock) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(followButtonWithBlock, "");
        followButtonWithBlock.setShouldShowMessageText(false);
        super.mo117869a(user, followButtonWithBlock);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell
    /* renamed from: a */
    public final void mo117876a(C74825a aVar, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(mutualRelationView, "");
        super.mo117876a(aVar, tuxTextView, mutualRelationView);
        User user = aVar.f168175a;
        if (user.getMutualStruct() != null) {
            mutualRelationView.setTuxTextSize(71);
            mutualRelationView.setAllTextColorUseAttrResource(R.attr.bj);
            List<MutualUser> userList = user.getMutualStruct().getUserList();
            if (userList == null || userList.isEmpty()) {
                mutualRelationView.mo125020a();
                mutualRelationView.getTvDesc().setMaxLines(2);
                mutualRelationView.getTvDesc().setMinTextSize(10.0f);
                mutualRelationView.getTvDesc().setGravity(17);
                return;
            }
            MutualStruct mutualStruct = user.getMutualStruct();
            C89219l.m154716b(mutualStruct, "");
            mutualRelationView.mo125022a(mutualStruct, 130.0f);
        }
    }
}
