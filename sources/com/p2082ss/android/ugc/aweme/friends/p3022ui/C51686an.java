package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.an */
final /* synthetic */ class C51686an implements AbstractC89172b {

    /* renamed from: a */
    private final InviteUserListActivity f119134a;

    static {
        Covode.recordClassIndex(61049);
    }

    C51686an(InviteUserListActivity inviteUserListActivity) {
        this.f119134a = inviteUserListActivity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        int i;
        InviteUserListActivity inviteUserListActivity = this.f119134a;
        TuxButton tuxButton = (TuxButton) obj;
        if (inviteUserListActivity.f119090l == 3) {
            i = R.string.bwz;
        } else if (inviteUserListActivity.f119090l == 2) {
            i = R.string.bwd;
        } else {
            i = inviteUserListActivity.f119090l == 4 ? R.string.bwj : 0;
        }
        tuxButton.setText(i);
        tuxButton.setButtonSize(3);
        tuxButton.setButtonVariant(0);
        tuxButton.setOnClickListener(new View$OnClickListenerC51689aq(inviteUserListActivity));
        return null;
    }
}
