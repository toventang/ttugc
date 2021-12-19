package com.p2082ss.android.ugc.aweme.relation.dialog;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.dialog.C66907c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.relation.dialog.a */
public final class C66897a extends AbstractC39060f<User> {

    /* renamed from: c */
    public static final C66898a f150180c = new C66898a((byte) 0);

    /* renamed from: a */
    final C66899b f150181a = new C66899b(1);

    /* renamed from: b */
    public final String f150182b;

    /* renamed from: d */
    private final HashMap<String, Boolean> f150183d = new HashMap<>();

    /* renamed from: e */
    private final AbstractC34478k<User> f150184e;

    static {
        Covode.recordClassIndex(78473);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.a$a */
    public static final class C66898a {
        static {
            Covode.recordClassIndex(78474);
        }

        private C66898a() {
        }

        public /* synthetic */ C66898a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.a$b */
    public static final class C66899b extends User {

        /* renamed from: a */
        private int f150185a;

        static {
            Covode.recordClassIndex(78475);
        }

        public C66899b() {
            this(0, 1, null);
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_dialog_SocialRecFriendsDialogAdapter$SocialRecDialogHint_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m118650xe852a350(int i) {
            return i;
        }

        public static /* synthetic */ C66899b copy$default(C66899b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f150185a;
            }
            return bVar.copy(i);
        }

        public final int component1() {
            return this.f150185a;
        }

        public final C66899b copy(int i) {
            return new C66899b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.model.User
        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C66899b) && this.f150185a == ((C66899b) obj).f150185a;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.model.User
        public final int hashCode() {
            return m118650xe852a350(this.f150185a);
        }

        public final String toString() {
            return "SocialRecDialogHint(recDialogType=" + this.f150185a + ")";
        }

        public final int getRecDialogType() {
            return this.f150185a;
        }

        public final void setRecDialogType(int i) {
            this.f150185a = i;
        }

        public C66899b(int i) {
            this.f150185a = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C66899b(int i, int i2, C89214g gVar) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        User user = (User) this.f92236l.get(i);
        if (!(user instanceof C66899b) || ((C66899b) user).getRecDialogType() != 1) {
            return 0;
        }
        return 1;
    }

    public C66897a(AbstractC34478k<User> kVar, String str) {
        C89219l.m154721d(kVar, "");
        this.f150184e = kVar;
        this.f150182b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i != 1) {
            C51648a aVar = C51648a.f118980a;
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC51756y a = aVar.mo87299a(context, this.f150183d, false, false);
            if (a == null) {
                C89219l.m154715b();
            }
            a.setEnterFrom("foru_boarding");
            a.setIgnoreRecFriendsCardExp(true);
            a.setListener(this.f150184e);
            return new C66909d(a);
        }
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2n, viewGroup, false);
        C89219l.m154716b(a2, "");
        C66907c cVar = new C66907c(a2);
        String str = this.f150182b;
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        cVar.f150200b = str;
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            return;
        }
        if (viewHolder instanceof C66907c) {
            C66907c cVar = (C66907c) viewHolder;
            cVar.f150199a.setMovementMethod(LinkMovementMethod.getInstance());
            cVar.f150199a.setHighlightColor(C0643b.m2378c(cVar.f150199a.getContext(), R.color.c9));
            Context context = cVar.f150199a.getContext();
            C89219l.m154716b(context, "");
            String string = context.getResources().getString(R.string.cv8);
            C89219l.m154716b(string, "");
            Context context2 = cVar.f150199a.getContext();
            C89219l.m154716b(context2, "");
            String string2 = context2.getResources().getString(R.string.c_e, string);
            C89219l.m154716b(string2, "");
            int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a >= 0) {
                spannableString.setSpan(new C66907c.C66908a(cVar), a, length, 34);
                spannableString.setSpan(new StyleSpan(1), a, length, 34);
            }
            cVar.f150199a.setText(spannableString);
        } else if (viewHolder instanceof C66909d) {
            C66909d dVar = (C66909d) viewHolder;
            Object obj = this.f92236l.get(i);
            C89219l.m154716b(obj, "");
            User user = (User) obj;
            C89219l.m154721d(user, "");
            dVar.f150202a.setData(user);
            dVar.f150202a.setPositionInApiList(i);
        }
    }

    /* renamed from: a */
    public final void mo105825a(User user, int i) {
        C89219l.m154721d(user, "");
        List list = this.f92236l;
        C89219l.m154716b(list, "");
        Iterator it = C89070n.m154518a((Collection<?>) list).iterator();
        while (it.hasNext()) {
            int a = ((AbstractC89040af) it).mo143429a();
            Object obj = this.f92236l.get(a);
            C89219l.m154716b(obj, "");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f92236l.get(a);
                C89219l.m154716b(obj2, "");
                ((User) obj2).setFollowStatus(i);
                notifyItemChanged(a);
            }
        }
    }
}
