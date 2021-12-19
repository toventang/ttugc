package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModel;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51456f;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.a.j */
public final class C51462j<T extends User> extends AbstractC34766g<T> implements SectionIndexer {

    /* renamed from: d */
    public boolean f118620d;

    /* renamed from: e */
    public int f118621e;

    /* renamed from: f */
    private SectionIndexer f118622f;

    /* renamed from: g */
    private C51464b f118623g;

    /* renamed from: h */
    private int f118624h;

    /* renamed from: i */
    private String f118625i;

    /* renamed from: j */
    private AbstractC51481b f118626j;

    /* renamed from: k */
    private C51456f.AbstractC51458a f118627k;

    /* renamed from: w */
    private View f118628w;

    /* renamed from: com.ss.android.ugc.aweme.friends.a.j$b */
    public static final class C51464b {

        /* renamed from: a */
        public int f118629a = -1;

        /* renamed from: b */
        public boolean f118630b;

        /* renamed from: c */
        public boolean f118631c;

        /* renamed from: d */
        public String f118632d;

        static {
            Covode.recordClassIndex(60723);
        }
    }

    static {
        Covode.recordClassIndex(60721);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final View mo61481b() {
        return this.f118628w;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: d */
    public final boolean mo61484d() {
        if (this.f118628w != null) {
            return true;
        }
        return false;
    }

    public final Object[] getSections() {
        SectionIndexer sectionIndexer = this.f118622f;
        if (sectionIndexer != null) {
            return sectionIndexer.getSections();
        }
        return new String[]{" "};
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        int i;
        int i2 = 0;
        if (this.f118628w == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f92236l != null) {
            i2 = this.f92236l.size();
        }
        return i + i2;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.j$a */
    static class C51463a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(60722);
        }

        C51463a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final void mo86941a(SectionIndexer sectionIndexer) {
        this.f118622f = sectionIndexer;
        this.f118623g.f118629a = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo61480a(View view) {
        if (view != null) {
            this.f118628w = view;
            notifyItemInserted(0);
        }
    }

    public final int getPositionForSection(int i) {
        SectionIndexer sectionIndexer = this.f118622f;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i);
        }
        return -1;
    }

    public final int getSectionForPosition(int i) {
        SectionIndexer sectionIndexer = this.f118622f;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i);
        }
        return -1;
    }

    /* renamed from: a */
    private T m95848a(int i) {
        if (this.f118628w != null) {
            i--;
        }
        if (i == -1 || i >= this.f92236l.size()) {
            return null;
        }
        return (T) ((User) this.f92236l.get(i));
    }

    public C51462j(AbstractC51481b bVar) {
        this.f118623g = new C51464b();
        this.f118624h = 0;
        this.f118626j = bVar;
        mo67825k();
    }

    /* renamed from: a */
    public final int mo86939a(ContactModel contactModel) {
        Friend friend;
        int size = this.f92236l.size();
        for (int i = 0; i < size; i++) {
            if ((this.f92236l.get(i) instanceof Friend) && (friend = (Friend) this.f92236l.get(i)) != null && contactModel.equals(new ContactModel(friend.getSocialName(), friend.getNickname()))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo86943b(String str) {
        if (mo60933c() == 0) {
            return -1;
        }
        int size = this.f92236l.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f92236l.get(i);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                if (mo61484d()) {
                    return i + 1;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<T> list) {
        if (list == null || !this.f118620d || this.f118624h != 0) {
            super.mo62377b_(list);
            return;
        }
        int size = list.size();
        int i = this.f118621e;
        if (size - i > 0) {
            list.add(i, null);
        }
        if (this.f118621e > 0) {
            list.add(0, null);
        }
        this.f92236l = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final int mo86940a(String str) {
        if (mo60933c() == 0) {
            return -1;
        }
        int size = this.f92236l.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f92236l.get(i);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo60936c(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.f118620d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002b
            int r0 = r5.f118624h
            if (r0 != 0) goto L_0x002b
            int r2 = r5.f118621e
            r1 = 4
            if (r2 <= 0) goto L_0x001f
            if (r6 != 0) goto L_0x0013
            r0 = 3
            return r0
        L_0x0013:
            int r0 = r2 + 1
            if (r6 != r0) goto L_0x0018
            return r1
        L_0x0018:
            if (r6 <= 0) goto L_0x002a
            int r2 = r2 + r3
            if (r6 >= r2) goto L_0x002a
            r0 = 5
            return r0
        L_0x001f:
            java.util.List r0 = r5.f92236l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x002a
            if (r6 != 0) goto L_0x002a
            return r1
        L_0x002a:
            return r4
        L_0x002b:
            android.view.View r0 = r5.f118628w
            if (r0 == 0) goto L_0x0034
            if (r6 != 0) goto L_0x0034
            r0 = 101(0x65, float:1.42E-43)
            return r0
        L_0x0034:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.m95848a(r6)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.aweme.friends.model.FacebookFriends
            if (r0 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.m95848a(r6)
            com.ss.android.ugc.aweme.friends.model.FacebookFriends r0 = (com.p2082ss.android.ugc.aweme.friends.model.FacebookFriends) r0
            int r0 = r0.getType()
            if (r0 != r3) goto L_0x004a
            r0 = 6
            return r0
        L_0x004a:
            r0 = 7
            return r0
        L_0x004c:
            boolean r0 = r5.f118620d
            if (r0 == 0) goto L_0x0051
            return r4
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3011a.C51462j.mo60936c(int):int");
    }

    /* renamed from: a */
    public final void mo86942a(FollowStatus followStatus) {
        User user;
        int a = mo86940a(followStatus.userId);
        if (a != -1 && a < this.f92236l.size() && (user = (User) this.f92236l.get(a)) != null) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) != f82108b) {
            if (!(this.f118628w == null || i == 0)) {
                i--;
            }
            mo61483b(viewHolder, i);
        } else if (viewHolder instanceof AbstractC39063h.C39069c) {
            ((AbstractC39063h.C39069c) viewHolder).mo67826a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        View view;
        boolean z;
        if (i == 101) {
            return new C51463a(this.f118628w);
        }
        if (i == 3 || i == 4) {
            return new C51473q(viewGroup);
        }
        if (i == 6) {
            return new C51459g(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2b, viewGroup, false));
        }
        if (i == 7) {
            return new C51456f(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2a, viewGroup, false), this.f118627k);
        }
        if (i == 2 || i == 5) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2h, viewGroup, false);
        } else {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2e, viewGroup, false);
        }
        AbstractC51481b bVar = this.f118626j;
        if (this.f118624h != 0) {
            z = true;
        } else {
            z = false;
        }
        return new C51465k(view, bVar, z, this.f118620d, this.f118625i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027c, code lost:
        if (mo60936c(0) == 4) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61483b(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
        // Method dump skipped, instructions count: 743
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3011a.C51462j.mo61483b(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C51462j(int i, String str, AbstractC51481b bVar, C51456f.AbstractC51458a aVar) {
        this.f118623g = new C51464b();
        this.f118624h = i;
        this.f118625i = str;
        this.f118626j = bVar;
        this.f118627k = aVar;
        mo67825k();
    }
}
