package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.notification.followrequest.AbstractC62004a;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.C62011b;
import com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.View$OnClickListenerC62009a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w;
import com.p2082ss.android.ugc.aweme.notification.utils.C62256c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.c */
public final class C61817c extends AbstractC39060f<User> implements AbstractC61851j {

    /* renamed from: c */
    public static final C61818a f140325c = new C61818a((byte) 0);

    /* renamed from: a */
    public int f140326a;

    /* renamed from: b */
    public final C62256c f140327b = new C62256c();

    /* renamed from: d */
    private final HashSet<String> f140328d = new HashSet<>();

    /* renamed from: e */
    private final AbstractC62004a f140329e;

    static {
        Covode.recordClassIndex(72553);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return 15;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.c$a */
    public static final class C61818a {
        static {
            Covode.recordClassIndex(72554);
        }

        private C61818a() {
        }

        public /* synthetic */ C61818a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<User> list) {
        super.mo62377b_(list);
        AbstractC62159w.C62160a.m112409a(AbstractC62159w.EnumC62162c.FOLLOW_REQUEST);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        C56386j.m102364b();
    }

    public C61817c(AbstractC62004a aVar) {
        C89219l.m154721d(aVar, "");
        this.f140329e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61851j
    /* renamed from: d */
    public final void mo93501d(int i) {
        if (i >= 0 && i < mo63369e().size()) {
            mo63369e().remove(i);
            if (mo63369e().isEmpty()) {
                notifyDataSetChanged();
                this.f140329e.mo99808a();
                return;
            }
            notifyItemRemoved(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c5);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c);
        tuxTextView.setText(R.string.cfm);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(tuxTextView));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        Object obj = mo63369e().get(i);
        C89219l.m154716b(obj, "");
        ((C62011b) viewHolder).mo100065a((User) obj, "follow_request_page");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder bVar;
        C89219l.m154721d(viewGroup, "");
        if (i != 15) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.k8, viewGroup, false);
            AbstractC62004a aVar = this.f140329e;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type android.app.Activity");
            bVar = new View$OnClickListenerC62009a(a, (Activity) aVar, this, this.f140328d);
        } else {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.kd, viewGroup, false);
            C89219l.m154716b(a2, "");
            bVar = new C62011b(a2, this, this.f140327b);
        }
        if (bVar instanceof AbstractC62159w) {
            ((AbstractC62159w) bVar).mo100164a(AbstractC62159w.EnumC62162c.FOLLOW_REQUEST);
        }
        return bVar;
    }
}
