package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.C51772b;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.C51774c;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.C51777d;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.d */
public final class C51780d extends AbstractC1483t<AbstractC51770a, AbstractC51771a<?>> {

    /* renamed from: b */
    AbstractC89172b<? super RecyclerView, C89391z> f119335b;

    /* renamed from: c */
    AbstractC89172b<? super RecyclerView, C89391z> f119336c;

    /* renamed from: d */
    public AbstractC1214u<Boolean> f119337d;

    /* renamed from: e */
    final SparseArray<C56520b> f119338e;

    /* renamed from: f */
    private final Fragment f119339f;

    /* renamed from: g */
    private final ContactVM f119340g;

    static {
        Covode.recordClassIndex(61145);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m96465a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return ((AbstractC51770a) mo5017a(i)).f119323a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        AbstractC89172b<? super RecyclerView, C89391z> bVar = this.f119335b;
        if (bVar != null) {
            bVar.invoke(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        AbstractC89172b<? super RecyclerView, C89391z> bVar = this.f119336c;
        if (bVar != null) {
            bVar.invoke(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC51771a aVar = (AbstractC51771a) viewHolder;
        C89219l.m154721d(aVar, "");
        aVar.mo87500b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC51771a aVar = (AbstractC51771a) viewHolder;
        C89219l.m154721d(aVar, "");
        aVar.mo87502c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        int hashCode;
        AbstractC51770a aVar = (AbstractC51770a) mo5017a(i);
        if (aVar instanceof C51781e) {
            C51781e eVar = (C51781e) aVar;
            String socialName = eVar.f119341b.getSocialName();
            if (socialName != null) {
                hashCode = socialName.hashCode();
            } else {
                hashCode = eVar.f119341b.hashCode();
            }
        } else {
            hashCode = aVar.hashCode();
        }
        return (long) hashCode;
    }

    public /* synthetic */ C51780d(Fragment fragment, ContactVM contactVM) {
        this(fragment, contactVM, new C51778b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        AbstractC51771a aVar = (AbstractC51771a) viewHolder;
        C89219l.m154721d(aVar, "");
        Object a = mo5017a(i);
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        if (!(a instanceof AbstractC51770a)) {
            obj = null;
        } else {
            obj = a;
        }
        AbstractC51770a aVar2 = (AbstractC51770a) obj;
        if (aVar2 != null) {
            aVar.f119326c = i;
            aVar.f119325b = (T) ((AbstractC51770a) a);
            aVar.mo87498a(aVar2);
            return;
        }
        View view = aVar.itemView;
        C89219l.m154716b(view, "");
        view.setVisibility(8);
        C39109f.m79404c("ContactBaseVH", "MultiBaseVH innerOnBind data type is not match!");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C51780d(Fragment fragment, ContactVM contactVM, C51778b bVar) {
        super(bVar);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(contactVM, "");
        C89219l.m154721d(bVar, "");
        this.f119339f = fragment;
        this.f119340g = contactVM;
        this.f119338e = new SparseArray<>();
        setHasStableIds(true);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m96465a(C51780d dVar, ViewGroup viewGroup, int i) {
        AbstractC51771a cVar;
        MethodCollector.m26663i(11569);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 1) {
            C51648a aVar = C51648a.f118980a;
            ActivityC0945e requireActivity = dVar.f119339f.requireActivity();
            C89219l.m154716b(requireActivity, "");
            AbstractC51538a b = aVar.mo87312b((Context) requireActivity);
            b.mo87038a(dVar.f119339f);
            AbstractC1214u<Boolean> uVar = dVar.f119337d;
            if (uVar != null) {
                b.getOnLoading().observe(dVar.f119339f, uVar);
            }
            cVar = new C51774c(b);
        } else if (i != 2) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2o, viewGroup, false);
            C89219l.m154716b(a, "");
            cVar = new C51777d(a);
        } else {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2f, viewGroup, false);
            C89219l.m154716b(a2, "");
            cVar = new C51772b(a2);
        }
        ContactVM contactVM = dVar.f119340g;
        C89219l.m154721d(contactVM, "");
        cVar.f119324a = contactVM;
        C56520b bVar = dVar.f119338e.get(i);
        if (bVar != null) {
            cVar.mo87499a(bVar);
        }
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(11569);
        return cVar;
    }
}
