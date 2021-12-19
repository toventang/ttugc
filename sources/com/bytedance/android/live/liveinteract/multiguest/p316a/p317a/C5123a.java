package com.bytedance.android.live.liveinteract.multiguest.p316a.p317a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.a */
public final class C5123a extends RecyclerView.AbstractC1350a<C5128c> {

    /* renamed from: a */
    public AbstractC5127b f13299a;

    /* renamed from: b */
    public List<C7666e> f13300b;

    /* renamed from: c */
    private View.OnClickListener f13301c = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.View$OnClickListenerC51241 */

        static {
            Covode.recordClassIndex(5716);
        }

        public final void onClick(View view) {
            String secUid;
            if (C5123a.this.f13299a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof C7666e) {
                    C7666e eVar = (C7666e) tag;
                    User user = eVar.f19001c;
                    view.setEnabled(false);
                    if (C5123a.this.mo10851a() < C6894d.m14753a().f17275v) {
                        C5714i.m12528a(0, user.getId(), eVar.mo13898a());
                        AbstractC5127b bVar = C5123a.this.f13299a;
                        long id = user.getId();
                        if (user.getSecUid() == null) {
                            secUid = "";
                        } else {
                            secUid = user.getSecUid();
                        }
                        bVar.mo10858a(id, secUid, eVar.mo13898a());
                        return;
                    }
                    C5714i.m12528a(1, user.getId(), eVar.mo13898a());
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gog);
                }
            }
        }
    };

    /* renamed from: d */
    private View.OnClickListener f13302d = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.View$OnClickListenerC51252 */

        static {
            Covode.recordClassIndex(5717);
        }

        public final void onClick(View view) {
            if (C5123a.this.f13299a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    long id = user.getId();
                    JSONObject jSONObject = new JSONObject();
                    C3866a.m9474a(jSONObject, "guest_user_id", id);
                    C5714i iVar = C5714i.f14494j;
                    C5714i.m12550a((C5714i) true, (boolean) "disconnect_guest_click", (String) jSONObject, (JSONObject) 0);
                    C5123a.this.f13299a.mo10859a(user);
                }
            }
        }
    };

    /* renamed from: e */
    private View.OnClickListener f13303e = View$OnClickListenerC5129b.f13312a;

    /* renamed from: f */
    private int f13304f;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.a$b */
    public interface AbstractC5127b {
        static {
            Covode.recordClassIndex(5719);
        }

        /* renamed from: a */
        void mo10858a(long j, String str, String str2);

        /* renamed from: a */
        void mo10859a(User user);
    }

    static {
        Covode.recordClassIndex(5715);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C5128c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m11337a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f13300b.size();
    }

    /* renamed from: a */
    public final int mo10851a() {
        int i = 0;
        for (C7666e eVar : this.f13300b) {
            if (2 == eVar.f19003e) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int mo10854b() {
        int i = 0;
        for (C7666e eVar : this.f13300b) {
            if (1 == eVar.f19003e) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo10855c() {
        Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        for (C7666e eVar : this.f13300b) {
            if (a instanceof C5271a) {
                C5720o.m12574a(eVar.f19001c.getId(), ((C5271a) a).f13646q);
            } else {
                C5720o.m12574a(eVar.f19001c.getId(), (EnumC4422k) null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f13304f;
    }

    /* renamed from: a */
    public final void mo10853a(List<C7666e> list) {
        this.f13300b = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.a$a */
    public static class C5126a extends C5128c {

        /* renamed from: a */
        View f13307a;

        /* renamed from: b */
        View f13308b;

        static {
            Covode.recordClassIndex(5718);
        }

        C5126a(View view) {
            super(view);
            this.f13307a = view.findViewById(R.id.ac1);
            this.f13308b = view.findViewById(R.id.alr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.a$c */
    public static class C5128c extends RecyclerView.ViewHolder {

        /* renamed from: c */
        AvatarIconView f13309c;

        /* renamed from: d */
        TextView f13310d;

        /* renamed from: e */
        TextView f13311e;

        static {
            Covode.recordClassIndex(5720);
        }

        C5128c(View view) {
            super(view);
            this.f13309c = (AvatarIconView) view.findViewById(R.id.op);
            this.f13310d = (TextView) view.findViewById(R.id.cpj);
            this.f13311e = (TextView) view.findViewById(R.id.ajt);
        }
    }

    /* renamed from: a */
    public final void mo10852a(long j) {
        int size = this.f13300b.size();
        if (size > 0) {
            int i = 0;
            do {
                C7666e eVar = this.f13300b.get(i);
                if (eVar == null || eVar.f19001c == null || eVar.f19001c.getId() != j) {
                    i++;
                } else if (i >= 0 && i < size) {
                    this.f13300b.remove(i);
                    notifyItemRemoved(i);
                    return;
                } else {
                    return;
                }
            } while (i < size);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m11337a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(5270);
        if (i == 0) {
            viewHolder = new C5126a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_b, (ViewGroup) null));
        } else {
            viewHolder = new C5128c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_a, viewGroup, false));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(5270);
        return viewHolder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.C5128c r10, int r11) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5123a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C5123a(AbstractC5127b bVar, List<C7666e> list, int i) {
        this.f13299a = bVar;
        if (list != null) {
            this.f13300b = list;
            if (i == 0 || i == 1) {
                this.f13304f = i;
                return;
            }
            throw new IllegalArgumentException("Type must be 1 for anchor or 2 for audience.");
        }
        throw new RuntimeException("List can not be null.");
    }
}
