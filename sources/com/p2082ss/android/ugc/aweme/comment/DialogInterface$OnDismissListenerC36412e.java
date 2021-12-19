package com.p2082ss.android.ugc.aweme.comment;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.e */
final /* synthetic */ class DialogInterface$OnDismissListenerC36412e implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final C36274b f86106a;

    static {
        Covode.recordClassIndex(43707);
    }

    DialogInterface$OnDismissListenerC36412e(C36274b bVar) {
        this.f86106a = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        List e;
        C36274b bVar = this.f86106a;
        if (bVar.f85731b instanceof C37157k) {
            C37157k kVar = (C37157k) bVar.f85731b;
            if (!(kVar.f87638v == null || (e = kVar.f87638v.mo63369e()) == null)) {
                User curUser = C31575b.m65865g().getCurUser();
                int[] iArr = {-1, -1};
                for (int i = 0; i < e.size(); i++) {
                    User user = ((Comment) e.get(i)).getUser();
                    if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                        user.setNickname(curUser.getNickname());
                        user.setAvatarThumb(curUser.getAvatarThumb());
                        if (iArr[0] == -1) {
                            iArr[0] = i;
                        }
                        iArr[1] = i;
                    }
                }
                if (iArr[0] >= 0) {
                    kVar.f87638v.notifyItemRangeChanged(iArr[0], (iArr[1] - iArr[0]) + 1);
                }
            }
        }
    }
}
