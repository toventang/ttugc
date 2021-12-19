package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51770a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.a.a */
public abstract class AbstractC51771a<T extends AbstractC51770a> extends RecyclerView.ViewHolder implements AbstractC56519a {

    /* renamed from: a */
    public ContactVM f119324a;

    /* renamed from: b */
    public T f119325b;

    /* renamed from: c */
    public int f119326c = -1;

    /* renamed from: d */
    public C56520b f119327d;

    static {
        Covode.recordClassIndex(61136);
    }

    /* renamed from: a */
    public abstract void mo87498a(T t);

    /* renamed from: b */
    public void mo87500b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo87501b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: c */
    public void mo87502c() {
    }

    /* renamed from: a */
    public final ContactVM mo87497a() {
        ContactVM contactVM = this.f119324a;
        if (contactVM == null) {
            C89219l.m154710a("contactVM");
        }
        return contactVM;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC51771a(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a
    /* renamed from: a */
    public final void mo87499a(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f119327d, bVar)) {
            this.f119327d = bVar;
            mo87501b(bVar);
        }
    }
}
