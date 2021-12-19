package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3906af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17436f;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.uikit.p1282d.C18252c;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AbsShareWebContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupInviteCardContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareCompilationContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveEventContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareMusicContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareQnAContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareSearchContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStickerContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareWebContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b.C53714b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54014a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54017b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3092b.C53840a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.AbstractC54313b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53647c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3081a.AbstractC53632a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.C54379b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54560p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54518b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54542d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54562q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.ChatRoomLiveStateManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.View$OnClickListenerC54541c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55070h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55171ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55185ag;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55208f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c */
public abstract class AbstractC54386c extends AbstractC54375a {

    /* renamed from: A */
    private int f124572A;

    /* renamed from: B */
    private final List<AbstractC54392b> f124573B = new ArrayList();

    /* renamed from: d */
    public int f124574d;

    /* renamed from: e */
    public AbstractC17434e f124575e;

    /* renamed from: f */
    public ChatRoomViewModel f124576f;

    /* renamed from: g */
    Handler f124577g;

    /* renamed from: h */
    public boolean f124578h = true;

    /* renamed from: i */
    public C19538ai f124579i;

    /* renamed from: j */
    public boolean f124580j = true;

    /* renamed from: k */
    public boolean f124581k;

    /* renamed from: l */
    public Runnable f124582l;

    /* renamed from: m */
    public C53840a f124583m;

    /* renamed from: n */
    public final C53709a f124584n;

    /* renamed from: o */
    public C1213t<List<C19538ai>> f124585o;

    /* renamed from: p */
    public final C1213t<C19538ai> f124586p = new C1213t<>();

    /* renamed from: q */
    public ChatRoomLiveStateManager f124587q;

    /* renamed from: r */
    int f124588r;

    /* renamed from: s */
    int f124589s;

    /* renamed from: t */
    private C54562q f124590t;

    /* renamed from: u */
    private View.OnClickListener f124591u;

    /* renamed from: v */
    private AbstractC54313b f124592v;

    /* renamed from: w */
    private View.OnLongClickListener f124593w;

    /* renamed from: x */
    private View.OnTouchListener f124594x;

    /* renamed from: y */
    private C18252c f124595y;

    /* renamed from: z */
    private IMUser f124596z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c$a */
    public interface AbstractC54391a {
        static {
            Covode.recordClassIndex(64094);
        }

        /* renamed from: a */
        void mo91473a(C19538ai aiVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c$b */
    public interface AbstractC54392b {
        static {
            Covode.recordClassIndex(64095);
        }

        /* renamed from: a */
        void mo91330a();
    }

    static {
        Covode.recordClassIndex(64089);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91166a(AbstractC54482a aVar, C19538ai aiVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91458a(AbstractC54482a aVar, EnumC53772b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo91167a(AbstractC54482a aVar, IMUser iMUser, C19538ai aiVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo91459b(AbstractC54482a aVar, EnumC53772b bVar) {
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ AbstractC54482a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m99697a(this, viewGroup, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public final void mo90255a() {
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo91465a(List<C19538ai> list, int i) {
        boolean z = true;
        if (i == 4) {
            this.f124581k = true;
        }
        if (list != null && !list.isEmpty()) {
            C53840a aVar = this.f124583m;
            if (aVar != null) {
                aVar.mo90987a(this.f124575e, i == 5);
            }
            Message obtainMessage = this.f124577g.obtainMessage(1);
            C19538ai aiVar = list.get(0);
            switch (i) {
                case 0:
                    Runnable runnable = this.f124582l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    C53840a aVar2 = this.f124583m;
                    if (aVar2 != null) {
                        aVar2.mo90986a();
                        break;
                    }
                    break;
                case 1:
                    if (this.f124543b.contains(aiVar)) {
                        obtainMessage = this.f124577g.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.f124577g.obtainMessage(5);
                        break;
                    }
                case 2:
                    if (!this.f124584n.isStrangerChat()) {
                        if (list.size() == 1 && !this.f124543b.contains(aiVar)) {
                            obtainMessage = this.f124577g.obtainMessage(5);
                            break;
                        } else {
                            obtainMessage = this.f124577g.obtainMessage(2);
                            break;
                        }
                    } else {
                        obtainMessage = this.f124577g.obtainMessage(2);
                        this.f124584n.setChatType(0);
                        break;
                    }
                    break;
                case 3:
                    if (this.f124543b.contains(aiVar)) {
                        obtainMessage = this.f124577g.obtainMessage(7);
                        break;
                    }
                    break;
                case 4:
                    if (list.size() != this.f124575e.mo27764e()) {
                        z = false;
                    }
                    this.f124578h = z;
                    obtainMessage.arg1 = 4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (list.size() != this.f124575e.mo27764e()) {
                        z = false;
                    }
                    this.f124578h = z;
                    mo91168b();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (aiVar.isRecalled()) {
                        obtainMessage = this.f124577g.obtainMessage(4);
                        break;
                    } else if (aiVar.getMsgType() != 40) {
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    obtainMessage = this.f124577g.obtainMessage(2);
                    break;
            }
            obtainMessage.obj = list;
            this.f124577g.sendMessage(obtainMessage);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: a */
    public void mo90257a(Object obj, int i) {
        int i2;
        if (obj != null) {
            try {
                List list = (List) obj;
                int size = list.size();
                int i3 = 0;
                C19538ai aiVar = (C19538ai) list.get(0);
                if (i == 0) {
                    int indexOf = this.f124543b.indexOf(aiVar);
                    if (indexOf != -1) {
                        while (i3 < list.size() && (i2 = i3 + indexOf) < getItemCount()) {
                            this.f124543b.set(i2, aiVar);
                            i3++;
                        }
                        notifyItemRangeChanged(indexOf, size);
                    }
                } else if (i == 1) {
                    this.f124543b.addAll(0, list);
                    notifyItemRangeInserted(0, size);
                    C54542d f = C54542d.m100005f();
                    RecyclerView recyclerView = this.f124542a;
                    f.f125008d = true;
                    f.mo90193a(recyclerView, 0);
                    ChatRoomLiveStateManager chatRoomLiveStateManager = this.f124587q;
                    if (chatRoomLiveStateManager != null) {
                        C53700k.m98969a(new ChatRoomLiveStateManager.RunnableC54481j(chatRoomLiveStateManager));
                    }
                    if (this.f124542a != null && (this.f124542a.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) this.f124542a.getLayoutManager()).mo4371k() <= 10 && this.f124542a != null && (this.f124542a.getLayoutManager() instanceof LinearLayoutManager)) {
                        ((LinearLayoutManager) this.f124542a.getLayoutManager()).mo4347a(0, 0);
                    }
                } else if (i == 3) {
                    int indexOf2 = this.f124543b.indexOf(aiVar);
                    if (indexOf2 != -1) {
                        this.f124543b.removeAll(list);
                        notifyItemRangeRemoved(indexOf2, size);
                        if (indexOf2 > 0) {
                            notifyItemChanged(indexOf2 - 1);
                        }
                    }
                }
                super.mo90257a(obj, i);
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    /* renamed from: c */
    public void mo91411c() {
        this.f124543b = this.f124575e.mo27768i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.f124543b != null) {
            return this.f124543b.size();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo91468e() {
        if (this.f124574d == 1) {
            C54562q qVar = this.f124590t;
            if (qVar != null) {
                qVar.mo91644i();
                return;
            }
            return;
        }
        this.f124574d = 1;
        this.f124575e.mo27766g();
    }

    /* renamed from: b */
    private void mo91168b() {
        C54562q qVar = this.f124590t;
        if (qVar != null) {
            qVar.mo91645j();
        }
        int i = this.f124572A;
        if (i > 0 && i != this.f124575e.mo27764e()) {
            this.f124575e.mo27758a(this.f124572A);
            this.f124572A = 0;
        }
        this.f124574d = 0;
        if (this.f124543b.size() <= 1 && this.f124542a != null && this.f124542a.getLayoutManager() != null) {
            this.f124542a.getLayoutManager().mo4363e(0);
        }
    }

    /* renamed from: f */
    public final void mo91469f() {
        this.f124580j = false;
        C18252c cVar = this.f124595y;
        if (cVar != null && !cVar.f43499b && !cVar.f43500c) {
            cVar.f43501d.removeCallbacks(cVar.f43502e);
            if (!cVar.f43499b) {
                try {
                    if (cVar.f43498a.isShowing()) {
                        cVar.f43498a.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
            cVar.f43499b = true;
        }
        mo91457d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: b */
    public final void mo91456b(AbstractC54482a aVar) {
        super.onViewDetachedFromWindow(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    public /* bridge */ /* synthetic */ void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    public /* bridge */ /* synthetic */ void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo91454a(AbstractC53632a aVar) {
        super.mo91454a(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    public /* synthetic */ void onViewAttachedToWindow(AbstractC54482a aVar) {
        super.onViewAttachedToWindow(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    public /* synthetic */ void onViewDetachedFromWindow(AbstractC54482a aVar) {
        super.onViewDetachedFromWindow(aVar);
    }

    /* renamed from: b */
    public final C19538ai mo91466b(int i) {
        return (C19538ai) this.f124543b.get(i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewRecycled(AbstractC54482a aVar) {
        AbstractC54482a aVar2 = aVar;
        super.onViewRecycled(aVar2);
        aVar2.mo91578g();
    }

    /* renamed from: a */
    public final void mo91464a(AbstractC54392b bVar) {
        this.f124573B.add(bVar);
    }

    /* renamed from: c */
    public final void mo91467c(int i) {
        this.f124572A = this.f124575e.mo27764e();
        this.f124575e.mo27758a(i);
        mo91468e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        return EnumC53772b.valueOf((C19538ai) this.f124543b.get(i)).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        C19538ai aiVar = (C19538ai) this.f124543b.get(i);
        long rowId = aiVar.getRowId();
        if (rowId >= 0) {
            return rowId;
        }
        C56244a.m102191c("MessageAdapter", "Unsaved message showing in Adapter: ".concat(String.valueOf(aiVar)));
        long nextLong = AbstractC89255c.Default.nextLong(Long.MIN_VALUE, 0);
        C56244a.m102191c("MessageAdapter", "Setting message stable id: ".concat(String.valueOf(nextLong)));
        return nextLong;
    }

    public AbstractC54386c(C53709a aVar) {
        this.f124584n = aVar;
        this.f124543b = new ArrayList();
        this.f124577g = new HandlerC53707g(this);
        this.f124596z = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        if (this.f124591u == null) {
            this.f124591u = new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.View$OnClickListenerC543871 */

                static {
                    Covode.recordClassIndex(64090);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final /* synthetic */ void mo91470a(C19538ai aiVar) {
                    if (AbstractC54386c.this.f124543b.indexOf(aiVar) >= 0 && AbstractC54386c.this.f124542a != null) {
                        aiVar.addLocalExt("key_resend", "1");
                        C55231t.m101001b(aiVar);
                    }
                }

                public final void onClick(final View view) {
                    final String str;
                    C19538ai aiVar;
                    C55371a aVar;
                    String str2;
                    String str3;
                    Serializable serializable;
                    ClickAgent.onClick(view);
                    if (view.getTag(50331648) == null) {
                        C56244a.m102192d("MessageAdapter", "when click item ,but no type found ,maybe this is a bug!");
                        return;
                    }
                    int intValue = ((Integer) view.getTag(50331648)).intValue();
                    Object tag = view.getTag(150994945);
                    if (!(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
                        if (AbstractC54386c.this.f124584n == null || !AbstractC54386c.this.f124584n.isGroupChat()) {
                            str = "chat";
                        } else {
                            str = "group_chat";
                        }
                        C56244a.m102191c("MessageAdapter", "item click:".concat(String.valueOf(intValue)));
                        if (intValue == 2) {
                            AbstractC54386c.this.mo91462a(view, (String) view.getTag(67108864), (C19538ai) view.getTag(134217728), str);
                            return;
                        }
                        Aweme aweme = null;
                        if (intValue == 48) {
                            String str4 = (String) view.getTag(67108864);
                            Bundle bundle = (Bundle) view.getTag(50331652);
                            if (!(bundle == null || (serializable = bundle.getSerializable("currentAweme")) == null)) {
                                aweme = (Aweme) serializable;
                            }
                            if (str4 != null) {
                                C89219l.m154721d(str4, "");
                                Activity a = C55075a.m100721a();
                                if (a != null) {
                                    if (!C80422fe.m139425a(a)) {
                                        new C23144b(a).mo37640e(R.string.dcq).mo37637b();
                                        return;
                                    }
                                    if (aweme != null) {
                                        StoryServiceImpl.m135668l().mo120144a(str4, aweme);
                                    }
                                    SmartRouter.buildRoute(a, "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "chat_list").withParam("id", str4).open();
                                }
                            }
                        } else if (intValue == 3) {
                            String str5 = (String) view.getTag(67108864);
                            if (!TextUtils.isEmpty(str5)) {
                                if (AbstractC54386c.this.f124584n == null || !AbstractC54386c.this.f124584n.isAuthorSupporterChat() || C53651a.m98930d()) {
                                    if (AbstractC54386c.this.f124584n.getChatType() == 3) {
                                        C54881c.m100492a(str5, "group_chat");
                                    } else {
                                        C54881c.m100491a(str5);
                                    }
                                    C55059b.m100685a();
                                    C55059b.m100691a(str5, "", "pair", "click_head");
                                    C53615d.m98863a(str5, str, "click_head");
                                }
                            }
                        } else if (intValue == 4) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) view.getTag(100663296);
                            if (shareAwemeContent != null && !TextUtils.isEmpty(shareAwemeContent.getUser())) {
                                if (shareAwemeContent.getIsAdFake().booleanValue()) {
                                    new C23144b(view).mo37640e(R.string.o6).mo37637b();
                                    return;
                                }
                                C55059b.m100685a();
                                C55059b.m100691a(shareAwemeContent.getUser(), shareAwemeContent.getItemId(), "others", "click_head");
                                C53615d.m98863a(shareAwemeContent.getUser(), str, "click_head");
                                C55185ag.m100887a(shareAwemeContent.getUser(), shareAwemeContent.getSecUid());
                                C54542d.m100005f().mo90196b();
                            }
                        } else if (intValue == 5) {
                            C19538ai aiVar2 = (C19538ai) view.getTag(67108864);
                            if (aiVar2 != null) {
                                RecyclerView recyclerView = AbstractC54386c.this.f124542a;
                                AbstractC54386c cVar = AbstractC54386c.this;
                                C54379b bVar = new C54379b(recyclerView, cVar, aiVar2, cVar.f124584n);
                                AbstractC89568bz unused = C89624i.m155555a(bVar.f124553a, null, null, new C54379b.C54380a(bVar, null), 3);
                            }
                        } else if (intValue == 6) {
                            C19538ai aiVar3 = (C19538ai) view.getTag(67108864);
                            if (aiVar3 != null && aiVar3.isSelf()) {
                                Context context = view.getContext();
                                RunnableC54395f fVar = new RunnableC54395f(this, aiVar3);
                                C89219l.m154721d(context, "");
                                if (C55196f.m100911a(context)) {
                                    C23028c.m43435a((C23023b) new C23023b(context).mo37483b(R.string.cec), new C55208f.C55209a(fVar)).mo37405a().mo37396b().show();
                                }
                            }
                        } else if (intValue == 9) {
                            C56244a.m102193e("MessageAdapter", "Why MT has picture feature!!");
                        } else if (intValue == 11) {
                            Object tag2 = view.getTag(100663296);
                            if (tag2 instanceof VideoUpdateTipsContent) {
                                VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) tag2;
                                String uid = videoUpdateTipsContent.getUid();
                                String aid = videoUpdateTipsContent.getAid();
                                if (!TextUtils.isEmpty(uid) && !TextUtils.isEmpty(aid)) {
                                    SmartRouter.buildRoute(C17873f.m33102j(), C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(aid))).f85356a.mo52126a()).withParam("video_from", "from_profile_other").withParam("video_type", 0).withParam("userid", uid).withParam("refer", "update_tips").open();
                                }
                            }
                        } else if (intValue == 12) {
                            String str6 = (String) view.getTag(67108864);
                            if (!TextUtils.isEmpty(str6)) {
                                SmartRouter.buildRoute(view.getContext(), C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(str6))).f85356a.mo52126a()).withParam("refer", "chat").withParam("enter_method", "click_token").withParam("previous_page", "token").withParam("video_from", "from_chat").open();
                            }
                        } else if (intValue == 14) {
                            AbstractC54386c.this.mo91463a(view, (String) view.getTag(67108864), (C19538ai) view.getTag(134217728), "chat", ((CommentContent) view.getTag(100663296)).getCommentId());
                        } else if (intValue == 51) {
                            AbstractC54386c.this.mo91462a(view, (String) view.getTag(67108864), (C19538ai) view.getTag(134217728), "chat");
                        } else if (intValue == 17) {
                            Object tag3 = view.getTag(100663296);
                            if (tag3 instanceof ShareMusicContent) {
                                String uuid = UUID.randomUUID().toString();
                                ShareMusicContent shareMusicContent = (ShareMusicContent) tag3;
                                String musicId = shareMusicContent.getMusicId();
                                if (!TextUtils.isEmpty(musicId)) {
                                    SmartRouter.buildRoute(C17873f.m33102j(), C36131u.m73602a("aweme://music/detail/".concat(String.valueOf(musicId))).f85356a.mo52126a()).withParam("process_id", uuid).open();
                                }
                                C55059b.m100685a();
                                String musicId2 = shareMusicContent.getMusicId();
                                String singleChatFromUserId = AbstractC54386c.this.f124584n.getSingleChatFromUserId();
                                String conversationId = AbstractC54386c.this.f124584n.getConversationId();
                                C0484a aVar2 = new C0484a();
                                aVar2.put("to_user_id", singleChatFromUserId);
                                aVar2.put("conversation_id", conversationId);
                                aVar2.put("enter_from", "chat");
                                aVar2.put("music_id", musicId2);
                                aVar2.put("process_id", uuid);
                                C39162r.m79460a("enter_music_detail", aVar2);
                            }
                        } else if (intValue == 49) {
                            Object tag4 = view.getTag(100663296);
                            if (tag4 instanceof ShareQnAContent) {
                                String uuid2 = UUID.randomUUID().toString();
                                ShareQnAContent shareQnAContent = (ShareQnAContent) tag4;
                                SmartRouter.buildRoute(C17873f.m33102j(), "aweme://qna/detail/").withParam("id", Long.valueOf(shareQnAContent.getQuestionId()).toString()).withParam("process_id", uuid2).open();
                                C55059b.m100685a();
                                Long valueOf = Long.valueOf(shareQnAContent.getQuestionId());
                                String singleChatFromUserId2 = AbstractC54386c.this.f124584n.getSingleChatFromUserId();
                                String conversationId2 = AbstractC54386c.this.f124584n.getConversationId();
                                C0484a aVar3 = new C0484a();
                                aVar3.put("enter_from", "chat");
                                aVar3.put("enter_method", "chat_click");
                                aVar3.put("group_id", "");
                                aVar3.put("question_item_id", valueOf.toString());
                                aVar3.put("to_user_id", singleChatFromUserId2);
                                aVar3.put("conversation_id", conversationId2);
                                aVar3.put("process_id", uuid2);
                                C39162r.m79460a("enter_qa_detail_page", aVar3);
                            }
                        } else if (intValue == 45) {
                            Object tag5 = view.getTag(67108864);
                            if (tag5 != null) {
                                String str7 = (String) tag5;
                                if (!TextUtils.isEmpty(str7)) {
                                    AbstractC54386c.m99698a(C17873f.m33102j(), str7);
                                }
                                Object tag6 = view.getTag(50331649);
                                if (tag6 != null && (tag6 instanceof ShareLiveEventContent)) {
                                    ShareLiveEventContent shareLiveEventContent = (ShareLiveEventContent) tag6;
                                    boolean a2 = C3906af.m9538a(Uri.parse(URLDecoder.decode(shareLiveEventContent.getLinkUrl())), "is_paid_event");
                                    C55059b.m100685a();
                                    C55059b.m100692a(shareLiveEventContent.getEventId(), a2, "click");
                                }
                            }
                        } else if (intValue == 18) {
                            Object tag7 = view.getTag(67108864);
                            Object tag8 = view.getTag(50331649);
                            if (tag7 != null && tag8 != null) {
                                boolean booleanValue = ((Boolean) tag8).booleanValue();
                                String uuid3 = UUID.randomUUID().toString();
                                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), C36131u.m73602a("aweme://challenge/detail/".concat(String.valueOf(tag7))).f85356a.mo52126a());
                                if (booleanValue) {
                                    str3 = "1";
                                } else {
                                    str3 = "0";
                                }
                                buildRoute.withParam("is_commerce", str3).withParam("enter_from", "chat").withParam("process_id", uuid3).open();
                                String singleChatFromUserId3 = AbstractC54386c.this.f124584n.getSingleChatFromUserId();
                                String conversationId3 = AbstractC54386c.this.f124584n.getConversationId();
                                C0484a aVar4 = new C0484a();
                                aVar4.put("to_user_id", singleChatFromUserId3);
                                aVar4.put("conversation_id", conversationId3);
                                aVar4.put("enter_from", "chat");
                                aVar4.put("tag_id", tag7);
                                aVar4.put("process_id", uuid3);
                                C39162r.m79460a("enter_tag_detail", aVar4);
                            }
                        } else if (intValue == 21) {
                            Object tag9 = view.getTag(100663296);
                            if (tag9 instanceof ShareUserContent) {
                                ShareUserContent shareUserContent = (ShareUserContent) tag9;
                                C55185ag.m100887a(shareUserContent.getUid(), shareUserContent.getSecUid());
                            }
                        } else if (intValue == 22) {
                            Object tag10 = view.getTag(100663296);
                            if (tag10 instanceof ShareWebContent) {
                                AbsShareWebContent absShareWebContent = (AbsShareWebContent) tag10;
                                if (!TextUtils.isEmpty(absShareWebContent.getUrl())) {
                                    if (SmartRouter.canOpen(absShareWebContent.getUrl())) {
                                        SmartRouter.buildRoute(view.getContext(), absShareWebContent.getUrl()).open();
                                    } else {
                                        IEOYService b = EOYServiceImpl.m120048b();
                                        if (b == null || !b.mo106958a(view.getContext(), absShareWebContent.getUrl())) {
                                            Context context2 = view.getContext();
                                            String url = absShareWebContent.getUrl();
                                            C89219l.m154721d(context2, "");
                                            if (url == null || url.length() == 0) {
                                                C56244a.m102191c("SafeUrlOpenHelper", "openUrl url empty");
                                            } else {
                                                AbstractC56220e b2 = C55076b.m100723b();
                                                if (b2 != null) {
                                                    b2.openUrl(context2, url, true);
                                                }
                                            }
                                        }
                                    }
                                    Object tag11 = view.getTag(50331649);
                                    if ((tag11 instanceof Boolean) && ((Boolean) tag11).booleanValue()) {
                                        String obj = view.getTag(50331650).toString();
                                        String obj2 = view.getTag(50331650).toString();
                                        C0484a aVar5 = new C0484a();
                                        aVar5.put("author_id", obj);
                                        aVar5.put("message_id", obj2);
                                        aVar5.put("message_type", "picture");
                                        C39162r.m79460a("click_in_message", aVar5);
                                    }
                                }
                            }
                        } else if (intValue == 47) {
                            Object tag12 = view.getTag(100663296);
                            if (tag12 instanceof ShareSearchContent) {
                                ShareSearchContent shareSearchContent = (ShareSearchContent) tag12;
                                if (!TextUtils.isEmpty(shareSearchContent.getSchema())) {
                                    AbstractC54386c.m99698a(view.getContext(), shareSearchContent.getSchema());
                                }
                            }
                        } else if (intValue == 23) {
                            ShareLiveContent shareLiveContent = (ShareLiveContent) view.getTag(100663296);
                            C19538ai aiVar4 = (C19538ai) view.getTag(134217728);
                            Bundle bundle2 = new Bundle();
                            if (aiVar4 != null) {
                                bundle2.putString("share_user_id", String.valueOf(aiVar4.getSender()));
                            }
                            if (shareLiveContent != null) {
                                C55076b.m100723b().jumpToLivePage(view.getContext(), shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomId(), bundle2);
                            }
                        } else if (intValue == 24) {
                            ShareLiveContent shareLiveContent2 = (ShareLiveContent) view.getTag(100663296);
                            if (shareLiveContent2 != null) {
                                C55185ag.m100887a(shareLiveContent2.getRoomOwnerId(), shareLiveContent2.getRoomSecOwnerId());
                            }
                        } else if (intValue == 38) {
                            Object tag13 = view.getTag(100663296);
                            if (tag13 instanceof ShareCompilationContent) {
                                ShareCompilationContent shareCompilationContent = (ShareCompilationContent) tag13;
                                SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", shareCompilationContent.getCompilationId()).withParam("event_type", "chat").open();
                                C55059b.m100685a();
                                String compilationId = shareCompilationContent.getCompilationId();
                                String authorId = shareCompilationContent.getAuthorId();
                                C0484a aVar6 = new C0484a();
                                aVar6.put("enter_from", "chat");
                                aVar6.put("enter_method", "chat_click");
                                aVar6.put("compilation_id", compilationId);
                                aVar6.put("author_id", authorId);
                                C39162r.m79460a("enter_compilation_detail", aVar6);
                            }
                        } else if (intValue == 39) {
                            Object tag14 = view.getTag(100663296);
                            if (tag14 instanceof ShareStickerContent) {
                                ShareStickerContent shareStickerContent = (ShareStickerContent) tag14;
                                SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail/").withParam("id", shareStickerContent.getStickerId()).open();
                                C55059b.m100685a();
                                String stickerId = shareStickerContent.getStickerId();
                                C0484a aVar7 = new C0484a();
                                aVar7.put("enter_from", "chat");
                                aVar7.put("prop_id", stickerId);
                                C39162r.m79460a("enter_prop_detail", aVar7);
                            }
                        } else if (intValue == 41) {
                            Object tag15 = view.getTag(67108864);
                            if (tag15 != null) {
                                AbstractC54386c cVar2 = AbstractC54386c.this;
                                cVar2.f124575e.mo27767h().remove(tag15);
                                cVar2.f124577g.sendMessage(cVar2.f124577g.obtainMessage(1));
                                C55076b.m100723b().openNotificationSetting(view.getContext(), AbstractC54386c.this.f124584n.getSingleChatFromUserId());
                            }
                        } else if (intValue == 46) {
                            Object tag16 = view.getTag(100663296);
                            if ((tag16 instanceof GroupInviteCardContent) && (aiVar = (C19538ai) view.getTag(67108864)) != null) {
                                GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) tag16;
                                C19638h a3 = AbstractC17420a.C17421a.m32276a().mo27720a(AbstractC54386c.this.f124584n.getConversationId());
                                if (a3 != null) {
                                    aVar = new C55371a();
                                    aVar.setConversationId(a3.getConversationId());
                                    aVar.setConversationShortId(new StringBuilder().append(a3.getConversationShortId()).toString());
                                    if (a3.getCoreInfo() != null) {
                                        aVar.setAvatarUrl(a3.getCoreInfo().getIcon());
                                    }
                                    aVar.setGroupSize(Integer.valueOf(a3.getMemberCount()));
                                    aVar.setName(C55339a.m101156e(a3));
                                } else {
                                    aVar = null;
                                }
                                Activity j = C17873f.m33102j();
                                long sender = aiVar.getSender();
                                C89219l.m154721d(groupInviteCardContent, "");
                                if (j instanceof ActivityC0945e) {
                                    C54017b bVar2 = new C54017b();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arg_invite_id", groupInviteCardContent.getInviteId());
                                    bundle3.putSerializable("arg_default_group", aVar);
                                    bundle3.putLong("arg_invite_sender", sender);
                                    bVar2.setArguments(bundle3);
                                    new C23226a.C23227a().mo37819a(true).mo37817a(bVar2).mo37815a(new C54014a.C54015a.DialogInterface$OnDismissListenerC54016a(j)).f55057a.show(((ActivityC0945e) j).getSupportFragmentManager(), "GroupInviteCardSheet");
                                }
                                C53709a aVar8 = AbstractC54386c.this.f124584n;
                                if (aVar8 != null) {
                                    C0484a aVar9 = new C0484a();
                                    if (aVar8.isGroupChat()) {
                                        str2 = "group";
                                    } else {
                                        str2 = "private";
                                    }
                                    aVar9.put("chat_type", str2);
                                    aVar9.put("conversation_id", aVar8.getConversationId());
                                    C39162r.m79460a("click_share_card", aVar9);
                                }
                            }
                        } else if (intValue == 50) {
                            final String str8 = (String) view.getTag(67108864);
                            AbstractC17436f.C17437a.m32346a().mo27770a(((Long) view.getTag(134217728)).longValue(), AbstractC17420a.C17421a.m32276a().mo27720a(AbstractC54386c.this.f124584n.getConversationId()), new AbstractC19479b() {
                                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.View$OnClickListenerC543871.C543881 */

                                static {
                                    Covode.recordClassIndex(64091);
                                }

                                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                                /* renamed from: a */
                                public final void mo27861a(Object obj) {
                                    AbstractC54386c.this.mo91462a(view, str8, (C19538ai) obj, str);
                                }

                                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                                /* renamed from: a */
                                public final void mo27860a(C19672u uVar) {
                                    C56244a.m102193e("MessageAdapter", "Not able to load message from server " + uVar.f46730c);
                                }
                            });
                        }
                    } else {
                        C56244a.m102191c("MessageAdapter", "onclick item content is illegal ".concat(String.valueOf(intValue)));
                    }
                }
            };
        }
        if (this.f124593w == null) {
            this.f124593w = new View.OnLongClickListener() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.View$OnLongClickListenerC543892 */

                /* renamed from: a */
                int f124602a;

                /* renamed from: b */
                BaseContent f124603b;

                /* renamed from: c */
                C19538ai f124604c;

                static {
                    Covode.recordClassIndex(64092);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:99:0x0226, code lost:
                    if (r3.getType() == 504) goto L_0x00be;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:100:0x0228 A[FALL_THROUGH] */
                /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
                /* JADX WARNING: Removed duplicated region for block: B:64:0x018c  */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x01ad  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x01c7  */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x01ca  */
                /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc A[FALL_THROUGH] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean onLongClick(android.view.View r23) {
                    /*
                    // Method dump skipped, instructions count: 682
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.View$OnLongClickListenerC543892.onLongClick(android.view.View):boolean");
                }
            };
        }
        if (this.f124594x == null) {
            this.f124594x = new View$OnTouchListenerC54394e(this);
        }
        if (aVar.getSelectMsgType() == 1 && this.f124592v == null) {
            this.f124592v = new C54393d(this);
        }
    }

    /* renamed from: a */
    public static boolean m99699a(C19538ai aiVar) {
        int msgType;
        if (aiVar.isSelf() || (msgType = aiVar.getMsgType()) == 14 || msgType == 1001 || msgType == 1002 || msgType == 1008 || msgType == 1009) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: a */
    public final void mo90256a(int i) {
        mo91411c();
        notifyDataSetChanged();
        List<AbstractC54392b> list = this.f124573B;
        if (list != null && !list.isEmpty()) {
            for (AbstractC54392b bVar : this.f124573B) {
                bVar.mo91330a();
            }
        }
        super.mo90256a(i);
        AbstractC81915c.m141874a(new C53714b("MessageAdapter.updateData"));
        if (i == 4) {
            C35434c.m72464b("im_chat_room");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54375a
    /* renamed from: a */
    public final void mo91455a(AbstractC54482a aVar) {
        super.onViewAttachedToWindow(aVar);
    }

    /* renamed from: a */
    public static void m99698a(Context context, String str) {
        if (str != null) {
            String a = C55070h.m100709a(str, C55070h.m100711a());
            if (a == null || TextUtils.equals(a, str)) {
                SmartRouter.buildRoute(context, str).open();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(a));
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(AbstractC54482a aVar, int i) {
        boolean z;
        AbstractC54482a aVar2 = aVar;
        C55171ac.m100879a("onBindViewHolder");
        if (aVar2.f124807c == EnumC53772b.LOAD_MORE.getViewType()) {
            C54562q qVar = (C54562q) aVar2;
            this.f124590t = qVar;
            qVar.mo91644i();
        } else {
            C19538ai aiVar = (C19538ai) this.f124543b.get(i);
            if (i < this.f124543b.size() - 1) {
                aVar2.mo91008a(aiVar, (C19538ai) this.f124543b.get(i + 1), EnumC53772b.content(aiVar), i);
            } else {
                aVar2.mo91008a(aiVar, null, EnumC53772b.content(aiVar), i);
            }
            mo91167a(aVar2, this.f124596z, aiVar);
            mo91166a(aVar2, aiVar);
            C1213t<List<C19538ai>> tVar = this.f124585o;
            if (tVar == null || tVar.getValue() == null || !this.f124585o.getValue().contains(aiVar)) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 8;
            if (aVar2.f124821q == 1) {
                if (aVar2.f124815k != null) {
                    aVar2.f124815k.setOnClickListener(new View$OnClickListenerC54541c(aVar2, aiVar));
                    aVar2.f124815k.setVisibility(0);
                }
                if (aVar2.f124810f != null) {
                    aVar2.f124810f.setChecked(z);
                }
                FrameLayout frameLayout = aVar2.f124811g;
                if (AbstractC54482a.m99818b(aiVar)) {
                    i2 = 0;
                }
                AbstractC54482a.m99817a(frameLayout, i2);
                if (aVar2.f124811g != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar2.f124811g.getLayoutParams();
                    marginLayoutParams.topMargin = 0;
                    aVar2.f124811g.setLayoutParams(marginLayoutParams);
                }
            } else {
                AbstractC54482a.m99817a(aVar2.f124811g, 8);
                AbstractC54482a.m99817a(aVar2.f124815k, 8);
            }
        }
        C55171ac.m100880b("onBindViewHolder");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m99697a(AbstractC54386c cVar, ViewGroup viewGroup, int i) {
        AbstractC54482a viewHolder;
        ChatRoomLiveStateManager chatRoomLiveStateManager;
        Context context = viewGroup.getContext();
        EnumC53772b valueOf = EnumC53772b.valueOf(i);
        View a = C1764a.m5927a(LayoutInflater.from(context), valueOf.getItemLayoutId(), viewGroup, false);
        C53709a aVar = cVar.f124584n;
        boolean z = true;
        if (aVar == null || aVar.getSelectMsgType() != 1) {
            viewHolder = valueOf.getViewHolder(a);
            viewHolder.f124821q = 0;
        } else {
            RecyclerView.C1367j jVar = new RecyclerView.C1367j(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(jVar);
            frameLayout.addView(a);
            frameLayout.addView(C1764a.m5927a(LayoutInflater.from(context), R.layout.a5e, viewGroup, false));
            viewHolder = valueOf.getViewHolder(frameLayout);
            viewHolder.f124821q = cVar.f124584n.getSelectMsgType();
        }
        cVar.mo91459b(viewHolder, valueOf);
        AbstractC54313b bVar = cVar.f124592v;
        if (viewHolder.f124810f != null) {
            viewHolder.f124810f.setOnCheckedChangeListener(new C54518b(viewHolder, bVar));
        }
        viewHolder.mo91565a(cVar.f124593w);
        viewHolder.mo91566a(cVar.f124594x);
        viewHolder.mo91564a(cVar.f124591u);
        if ((viewHolder instanceof AbstractC54560p) && (chatRoomLiveStateManager = cVar.f124587q) != null) {
            AbstractC54560p pVar = (AbstractC54560p) viewHolder;
            C89219l.m154721d(pVar, "");
            if (!chatRoomLiveStateManager.mo91556c().contains(pVar)) {
                pVar.mo91592a(chatRoomLiveStateManager.mo91553a(), chatRoomLiveStateManager.mo91555b(), (Set) chatRoomLiveStateManager.f124778a.getValue());
                chatRoomLiveStateManager.mo91556c().add(pVar);
            }
        }
        cVar.mo91458a(viewHolder, valueOf);
        viewHolder.mo91579h();
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        return viewHolder;
    }

    /* renamed from: a */
    public final void mo91462a(View view, String str, C19538ai aiVar, String str2) {
        mo91463a(view, str, aiVar, str2, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91463a(View view, String str, C19538ai aiVar, String str2, String str3) {
        String str4;
        String str5;
        boolean z;
        if (!TextUtils.isEmpty(str) && aiVar != null) {
            Bundle bundle = (Bundle) view.getTag(50331652);
            Aweme aweme = null;
            View view2 = (View) view.getTag(50331653);
            long j = -1;
            if (bundle != null) {
                j = bundle.getLong("position", -1);
                aweme = (Aweme) bundle.getSerializable("currentAweme");
            }
            if (!C55076b.m100723b().getIMSetting().f128315g) {
                str4 = String.valueOf(aiVar.getIndex());
                C55076b.m100723b().setIMAwemeProvider(new C53647c(this.f124584n.getConversationId(), aiVar, this.f124543b));
            } else {
                str4 = str;
            }
            if (((Integer) view.getTag(50331648)).intValue() == 50) {
                str5 = "click_quoted_message";
            } else {
                str5 = "click";
            }
            StringBuilder append = new StringBuilder("video clicked: ").append(str).append(" enter Method: ").append(str5).append(" , aweme is null: ");
            if (aweme == null) {
                z = true;
            } else {
                z = false;
            }
            C56244a.m102191c("MessageAdapter", append.append(z).toString());
            if (aweme == null || C55076b.m100723b() == null) {
                C54542d.m100005f().mo90196b();
                C54542d.m100005f().mo91632b(aiVar.getUuid());
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), C36131u.m73602a("aweme://aweme/detail/".concat(String.valueOf(str4))).mo63249a()).withParam("refer", str2).withParam("video_from", "from_chat").withParam("enter_method", str5).withParam("key_from_chat_room_playing", true).withParam("key_from_chat_room_real_aid", str).withParam("message", aiVar);
                if (str3 != null && !str3.isEmpty()) {
                    withParam.withParam("enter_method", "click_shared_comment").withParam("cid", str3);
                }
                withParam.open();
                return;
            }
            AbstractC56222f a = C54542d.m100005f().mo90191a(aiVar.getUuid());
            C55076b.m100723b().setSharePlayer(a, Long.valueOf(j));
            if (a != null) {
                a.mo92001c();
            }
            C55076b.m100723b().setNeedToContinueToPlay(true);
            AwemeService.m70060b().mo60677a(aweme);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key_from_chat_room_playing", true);
            bundle2.putString("key_from_chat_room_real_aid", str);
            bundle2.putString("enter_method", str5);
            bundle2.putSerializable("message", aiVar);
            if (str3 != null && !str3.isEmpty()) {
                bundle2.putString("cid", str3);
                bundle2.putString("enter_method", "click_shared_comment");
                bundle2.putString("realItemId", str);
            }
            C54542d.m100005f();
            C55076b.m100723b().enterDetailActivity(view.getContext(), str4, str2, "from_chat", aweme.getEnterpriseType(), 7000, "", view2, bundle2);
            C54542d.m100005f().mo91632b(aiVar.getUuid());
            C54542d f = C54542d.m100005f();
            aiVar.getUuid();
            f.mo90198d();
        }
    }
}
