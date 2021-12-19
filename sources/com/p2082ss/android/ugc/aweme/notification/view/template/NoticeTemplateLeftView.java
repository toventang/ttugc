package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateLeftView */
public final class NoticeTemplateLeftView extends AbstractView$OnClickListenerC62342g {

    /* renamed from: a */
    private SparseArray f141429a;

    static {
        Covode.recordClassIndex(73094);
    }

    public NoticeTemplateLeftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final View mo100306a(int i) {
        if (this.f141429a == null) {
            this.f141429a = new SparseArray();
        }
        View view = (View) this.f141429a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141429a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    public final EnumC62343h getTemplatePosition() {
        return EnumC62343h.Left;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: b */
    public final String mo100309b(View view) {
        C61621c cVar;
        C61630e templateNotice;
        C61621c cVar2;
        C61624f fVar;
        List<User> list;
        C61630e templateNotice2 = getTemplateNotice();
        if (templateNotice2 == null || (cVar = templateNotice2.f139886b) == null || ((cVar.f139840a == null && ((fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null || list.size() <= 1)) || (templateNotice = getTemplateNotice()) == null || (cVar2 = templateNotice.f139886b) == null)) {
            return null;
        }
        return cVar2.f139841b;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final boolean mo100308a(View view) {
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        User user;
        String str;
        C61630e eVar;
        String b = mo100309b(view);
        if (b != null) {
            mo100329a(b);
            return true;
        }
        C61630e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null || (user = (User) C89070n.m154583g((List) list)) == null) {
            return false;
        }
        if (!(user.getUid() == null || user.getSecUid() == null)) {
            AbstractC62027a mBridge = getMBridge();
            if (mBridge != null) {
                mBridge.mo100095o();
            }
            MusNotice mBaseNotice = getMBaseNotice();
            if (mBaseNotice == null || (eVar = mBaseNotice.templateNotice) == null) {
                str = null;
            } else {
                str = eVar.f139892h;
            }
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 == null || mBaseNotice2.type != 225 || TextUtils.isEmpty(str)) {
                AbstractC62027a mBridge2 = getMBridge();
                if (mBridge2 != null) {
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    String secUid = user.getSecUid();
                    C89219l.m154716b(secUid, "");
                    mBridge2.mo100086c(uid, secUid, "");
                }
            } else {
                AbstractC62027a mBridge3 = getMBridge();
                if (mBridge3 != null) {
                    mBridge3.mo100084a(user, "click_head");
                }
                C36125t.m73598a(C36125t.m73591a(), str);
                return true;
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final void mo100307a(MusNotice musNotice, AbstractC62027a aVar) {
        C61621c cVar;
        List list;
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(aVar, "");
        super.mo100307a(musNotice, aVar);
        ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setOnClickListener(this);
        ((ConstraintLayout) mo100306a(R.id.cug)).setOnClickListener(this);
        C61630e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f139886b) == null) {
            AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) mo100306a(R.id.cuh);
            C89219l.m154716b(avatarImageWithVerify, "");
            avatarImageWithVerify.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo100306a(R.id.cug);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setUserData(null);
            return;
        }
        AvatarImageWithVerify avatarImageWithVerify2 = (AvatarImageWithVerify) mo100306a(R.id.cuh);
        C89219l.m154716b(avatarImageWithVerify2, "");
        avatarImageWithVerify2.setVisibility(0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo100306a(R.id.cug);
        C89219l.m154716b(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        C61624f fVar = cVar.f139843d;
        if (fVar == null || (list = fVar.f139866a) == null) {
            list = C89086z.INSTANCE;
        }
        if (cVar.f139840a != null) {
            ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setUserData(new UserVerify(cVar.f139840a, null, null, null, 14, null));
        } else if (list.size() == 1) {
            ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setUserData(new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType())));
            ((AvatarImageWithVerify) mo100306a(R.id.cuh)).mo61285a();
        } else if (list.size() > 1) {
            AvatarImageWithVerify avatarImageWithVerify3 = (AvatarImageWithVerify) mo100306a(R.id.cuh);
            C89219l.m154716b(avatarImageWithVerify3, "");
            avatarImageWithVerify3.setVisibility(8);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) mo100306a(R.id.cug);
            C89219l.m154716b(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            C34577e.m70592a((RemoteImageView) mo100306a(R.id.cuj), ((User) list.get(0)).getAvatarThumb());
            C34577e.m70592a((RemoteImageView) mo100306a(R.id.cuk), ((User) list.get(1)).getAvatarThumb());
        } else {
            ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setUserData(null);
        }
    }

    private /* synthetic */ NoticeTemplateLeftView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateLeftView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.l6, this, true);
        ((AvatarImageWithVerify) mo100306a(R.id.cuh)).setRequestImgSize(C80397em.m139369a(101));
        C62023a.m112168a(mo100306a(R.id.cug));
    }
}
