package com.p2082ss.android.ugc.aweme.live.slot;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.C6163af;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.live.slot.C58763c;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.slot.e */
public final class C58780e extends AbstractC11293v {

    /* renamed from: a */
    public C58763c.C58769c f133782a;

    /* renamed from: b */
    RecyclerView f133783b;

    /* renamed from: c */
    IIconSlot.EnumC6149b f133784c;

    /* renamed from: d */
    C58763c.C58766a f133785d;

    static {
        Covode.recordClassIndex(69088);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5w);
        bVar.f27014a = 2;
        bVar.f27015b = R.style.a2b;
        bVar.mo18055a(new ColorDrawable(0));
        bVar.f27020g = 80;
        if (this.f133784c == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            bVar.f27019f = 0.5f;
        } else {
            bVar.f27019f = 0.0f;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(new ContextThemeWrapper(getActivity(), (int) R.style.mh));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("livesdk_tiktokec_action_sheet_show", new C33744d().mo59983a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).mo59983a("room_id", this.f133785d.mo96162a()).mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("live_status", this.f133785d.f133747d).mo59983a("page_name", "business_action_sheet").f79943a);
    }

    public C58780e(IIconSlot.EnumC6149b bVar, C58763c.C58766a aVar) {
        this.f133784c = bVar;
        this.f133785d = aVar;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.cy6).setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.live.slot.C58780e.View$OnClickListenerC587811 */

            static {
                Covode.recordClassIndex(69089);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C58780e.this.dismiss();
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e31);
        this.f133783b = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(1));
        final C58770d dVar = new C58770d(this, this.f133784c, this.f133785d);
        for (final Map.Entry<AbstractC6157ab, IIconSlot.SlotViewModel> entry : this.f133782a.f133753b.entrySet()) {
            entry.getValue().f15351b.observe(getViewLifecycleOwner(), new AbstractC1214u<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.live.slot.C58780e.C587822 */

                static {
                    Covode.recordClassIndex(69090);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    if (C58780e.this.isDetached()) {
                        return;
                    }
                    if (Boolean.TRUE.equals(bool)) {
                        C58770d dVar = dVar;
                        AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar = (AbstractC6157ab) entry.getKey();
                        C89219l.m154721d(abVar, "");
                        int a = C6163af.m13409a(abVar.mo12080g());
                        int size = dVar.f133755a.size();
                        int i = 0;
                        int size2 = dVar.f133755a.size();
                        while (true) {
                            if (i >= size2) {
                                break;
                            } else if (a < C6163af.m13409a(dVar.f133755a.get(i).mo12080g())) {
                                size = i;
                                break;
                            } else {
                                i++;
                            }
                        }
                        dVar.f133755a.add(size, abVar);
                        dVar.notifyDataSetChanged();
                        ((AbstractC6157ab) entry.getKey()).mo12073a("before_live_dialog_item");
                        return;
                    }
                    C58770d dVar2 = dVar;
                    Object key = entry.getKey();
                    C89219l.m154721d(key, "");
                    dVar2.f133755a.remove(key);
                    dVar2.notifyDataSetChanged();
                }
            });
        }
        this.f133783b.setAdapter(dVar);
    }
}
