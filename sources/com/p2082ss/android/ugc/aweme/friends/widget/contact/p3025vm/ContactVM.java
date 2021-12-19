package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51770a;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM */
public abstract class ContactVM extends AbstractC1174ac {

    /* renamed from: a */
    public final Set<Integer> f119362a = new LinkedHashSet();

    /* renamed from: b */
    public final AbstractC89516am f119363b;

    /* renamed from: c */
    private final AbstractC89703z f119364c;

    static {
        Covode.recordClassIndex(61161);
    }

    /* renamed from: a */
    public abstract int mo87521a(AbstractC51770a aVar);

    /* renamed from: a */
    public abstract String mo87522a();

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        this.f119364c.mo143985a((CancellationException) null);
    }

    public ContactVM() {
        AbstractC89703z a = C89599cu.m155531a();
        this.f119364c = a;
        this.f119363b = C89517an.m155448a(C89652o.f203399a.plus(a));
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM$a */
    public static final class RunnableC51796a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactVM f119365a;

        /* renamed from: b */
        final /* synthetic */ String f119366b;

        /* renamed from: c */
        final /* synthetic */ String f119367c;

        /* renamed from: d */
        final /* synthetic */ String f119368d;

        static {
            Covode.recordClassIndex(61162);
        }

        public RunnableC51796a(ContactVM contactVM, String str, String str2, String str3) {
            this.f119365a = contactVM;
            this.f119366b = str;
            this.f119367c = str2;
            this.f119368d = str3;
        }

        public final void run() {
            C39162r.m79460a("invite_friend_click", C89041ag.m154421a(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("has_photo", this.f119366b), C89387v.m154943a("rank", this.f119367c), C89387v.m154943a("enter_method", this.f119365a.mo87522a()), C89387v.m154943a("url", this.f119368d)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM$b */
    public static final class RunnableC51797b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactVM f119369a;

        /* renamed from: b */
        final /* synthetic */ String f119370b;

        /* renamed from: c */
        final /* synthetic */ int f119371c;

        static {
            Covode.recordClassIndex(61163);
        }

        public RunnableC51797b(ContactVM contactVM, String str, int i) {
            this.f119369a = contactVM;
            this.f119370b = str;
            this.f119371c = i;
        }

        public final void run() {
            C39162r.m79460a("contact_invite_show", C89041ag.m154421a(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("has_photo", this.f119370b), C89387v.m154943a("rank", String.valueOf(this.f119371c)), C89387v.m154943a("enter_method", this.f119369a.mo87522a())));
        }
    }
}
