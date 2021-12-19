package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.widget.IndexView;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.q */
final /* synthetic */ class C51746q implements IndexView.AbstractC51758a {

    /* renamed from: a */
    private final ContactsActivity f119253a;

    /* renamed from: b */
    private final int f119254b;

    static {
        Covode.recordClassIndex(61109);
    }

    C51746q(ContactsActivity contactsActivity, int i) {
        this.f119253a = contactsActivity;
        this.f119254b = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.IndexView.AbstractC51758a
    /* renamed from: a */
    public final void mo87461a(int i) {
        ContactsActivity contactsActivity = this.f119253a;
        int i2 = this.f119254b;
        LinearLayoutManager linearLayoutManager = contactsActivity.f118999n;
        IndexView indexView = contactsActivity.f118992g;
        int i3 = 0;
        int i4 = 0;
        while (i3 < indexView.f119287b.size() && i3 < i) {
            i4 += indexView.f119287b.get(i3).intValue();
            i3++;
        }
        linearLayoutManager.mo4347a(i4 + i2, 0);
    }
}
