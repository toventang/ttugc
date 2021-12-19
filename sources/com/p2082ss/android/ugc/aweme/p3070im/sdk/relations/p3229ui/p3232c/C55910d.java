package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55178af;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55727e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d */
public final class C55910d extends AbstractC55903a<IMContact> {

    /* renamed from: j */
    public IMContact f127466j;

    /* renamed from: k */
    public int f127467k = -1;

    /* renamed from: l */
    public final ShareDialogViewModel f127468l;

    /* renamed from: m */
    private final int f127469m;

    /* renamed from: n */
    private final View f127470n = this.itemView.findViewById(R.id.ejf);

    /* renamed from: o */
    private final TextView f127471o = ((TextView) this.itemView.findViewById(R.id.title_tv));

    /* renamed from: p */
    private final ImageView f127472p = ((ImageView) this.itemView.findViewById(R.id.bmp));

    /* renamed from: q */
    private final TuxTextView f127473q = ((TuxTextView) this.itemView.findViewById(R.id.b91));

    /* renamed from: r */
    private final boolean f127474r;

    static {
        Covode.recordClassIndex(65701);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a
    /* renamed from: b */
    public final void mo92763b() {
        super.mo92763b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C55910d(android.view.ViewGroup r5, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.C55910d.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel, boolean):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a
    /* renamed from: a */
    public final /* synthetic */ void mo92761a(IMContact iMContact, IMContact iMContact2, int i) {
        String str;
        IMUser iMUser;
        int i2;
        IMContact iMContact3 = iMContact;
        IMContact iMContact4 = iMContact2;
        C89219l.m154721d(iMContact3, "");
        this.f127466j = iMContact3;
        this.f127467k = i;
        AvatarImageView avatarImageView = this.f127453c;
        UrlModel displayAvatar = iMContact3.getDisplayAvatar();
        int i3 = this.f127469m;
        C34577e.m70593a(avatarImageView, displayAvatar, i3, i3);
        IMUser a = C55083f.m100745a(iMContact3);
        TuxIconView tuxIconView = this.f127454d;
        C89219l.m154716b(tuxIconView, "");
        C55178af.m100885a(tuxIconView, a);
        if (this.f127468l.mo93016b()) {
            str = this.f127468l.mo93017c();
        } else {
            str = "";
        }
        TextView textView = this.f127455e;
        C89219l.m154716b(textView, "");
        C55727e.m101480a(textView, iMContact3.getDisplayName(), str);
        if (iMContact3 instanceof IMUser) {
            TextView textView2 = this.f127456f;
            C89219l.m154716b(textView2, "");
            IMUser iMUser2 = (IMUser) iMContact3;
            C55727e.m101480a(textView2, iMUser2.getUniqueId(), str);
            TextView textView3 = this.f127456f;
            C89219l.m154716b(textView3, "");
            textView3.setVisibility(0);
            TuxTextView tuxTextView = this.f127473q;
            C89219l.m154716b(tuxTextView, "");
            if (!IMUser.isFriend(iMUser2.getFollowStatus()) || IMUser.isSelf(iMUser2.getUid())) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            tuxTextView.setVisibility(i2);
        } else if (iMContact3 instanceof IMConversation) {
            TextView textView4 = this.f127456f;
            C89219l.m154716b(textView4, "");
            IMConversation iMConversation = (IMConversation) iMContact3;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.cu, iMConversation.getConversationMemberCount(), Integer.valueOf(iMConversation.getConversationMemberCount()));
            C89219l.m154716b(quantityString, "");
            textView4.setText(quantityString);
            TuxTextView tuxTextView2 = this.f127473q;
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        mo92760a();
        List<IMContact> value = this.f127468l.f128114d.getValue();
        if (value == null) {
            value = C89086z.INSTANCE;
        }
        TuxCheckBox tuxCheckBox = this.f127458h;
        C89219l.m154716b(tuxCheckBox, "");
        tuxCheckBox.setChecked(value.contains(iMContact3));
        TuxCheckBox tuxCheckBox2 = this.f127458h;
        C89219l.m154716b(tuxCheckBox2, "");
        tuxCheckBox2.setClickable(false);
        if (iMContact3.getType() != 3) {
            View view2 = this.f127470n;
            C89219l.m154716b(view2, "");
            view2.setVisibility(8);
        } else {
            View view3 = this.f127470n;
            C89219l.m154716b(view3, "");
            view3.setVisibility(0);
            ImageView imageView = this.f127472p;
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
            TextView textView5 = this.f127471o;
            C89219l.m154716b(textView5, "");
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            Context context2 = view4.getContext();
            C89219l.m154716b(context2, "");
            textView5.setText(context2.getResources().getString(R.string.bxu));
        }
        if (!this.f127474r) {
            IMUser a2 = C55083f.m100745a(iMContact3);
            Boolean bool = null;
            if (iMContact4 != null) {
                iMUser = C55083f.m100745a(iMContact4);
            } else {
                iMUser = null;
            }
            if (a2 != null) {
                ShareDialogViewModel shareDialogViewModel = this.f127468l;
                if (shareDialogViewModel != null) {
                    bool = Boolean.valueOf(shareDialogViewModel.mo93016b());
                }
                if (!bool.booleanValue()) {
                    if ((a2.getType() == 3 || a2.getType() == 0) && (iMUser == null || (!C89219l.m154714a((Object) iMUser.getInitialLetter(), (Object) a2.getInitialLetter())))) {
                        TextView textView6 = this.f127457g;
                        C89219l.m154716b(textView6, "");
                        textView6.setVisibility(0);
                        TextView textView7 = this.f127457g;
                        C89219l.m154716b(textView7, "");
                        textView7.setText(a2.getInitialLetter());
                        return;
                    }
                }
            }
            TextView textView8 = this.f127457g;
            C89219l.m154716b(textView8, "");
            textView8.setVisibility(8);
            View view5 = this.f127470n;
            C89219l.m154716b(view5, "");
            view5.setVisibility(8);
            return;
        }
        TextView textView9 = this.f127457g;
        C89219l.m154716b(textView9, "");
        textView9.setVisibility(8);
    }
}
