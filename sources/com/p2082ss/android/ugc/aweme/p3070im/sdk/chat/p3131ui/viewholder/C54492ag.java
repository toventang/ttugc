package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.p025c.C0484a;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.View$OnAttachStateChangeListenerC54496ak;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55225q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ag */
public class C54492ag extends AbstractC54482a<ShareLiveContent> implements AbstractC54560p {

    /* renamed from: A */
    private RemoteImageView f124852A;

    /* renamed from: B */
    private TextView f124853B;

    /* renamed from: C */
    private ImageView f124854C;

    /* renamed from: D */
    private View f124855D;

    /* renamed from: E */
    private TextView f124856E;

    /* renamed from: F */
    private ViewGroup f124857F;

    /* renamed from: G */
    private RemoteImageView f124858G;

    /* renamed from: H */
    private TextView f124859H;

    /* renamed from: I */
    private ViewGroup f124860I;

    /* renamed from: J */
    private RemoteImageView f124861J;

    /* renamed from: K */
    private TextView f124862K;

    /* renamed from: L */
    private TextView f124863L;

    /* renamed from: M */
    private TextView f124864M;

    /* renamed from: N */
    private View f124865N;

    /* renamed from: O */
    private View f124866O;

    /* renamed from: P */
    private ObjectAnimator f124867P;

    /* renamed from: Q */
    private HashMap<String, NewLiveRoomStruct> f124868Q;

    /* renamed from: R */
    private Map<String, Boolean> f124869R;

    /* renamed from: S */
    private View$OnAttachStateChangeListenerC54496ak f124870S;

    /* renamed from: T */
    private Set<Long> f124871T;

    /* renamed from: U */
    private boolean f124872U;

    /* renamed from: b */
    private LinearLayout f124873b;

    /* renamed from: x */
    private RemoteImageView f124874x;

    /* renamed from: y */
    private TextView f124875y;

    /* renamed from: z */
    private TextView f124876z;

    static {
        Covode.recordClassIndex(64203);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54560p
    /* renamed from: d */
    public final void mo91595d() {
        m99865j();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54560p
    /* renamed from: b */
    public final String mo91593b() {
        if (this.f124820p != null) {
            return ((ShareLiveContent) this.f124820p).getRoomOwnerId();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54560p
    /* renamed from: c */
    public final String mo91594c() {
        if (this.f124820p != null) {
            return ((ShareLiveContent) this.f124820p).getRoomSecOwnerId();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: g */
    public final void mo91578g() {
        super.mo91578g();
        this.f124867P.cancel();
        this.f124872U = true;
    }

    /* renamed from: i */
    private boolean m99864i() {
        int followStatus;
        boolean z;
        if (this.f124820p == null) {
            return false;
        }
        IMUser a = C55085g.m100751a(((ShareLiveContent) this.f124820p).getRoomOwnerId(), ((ShareLiveContent) this.f124820p).getRoomSecOwnerId());
        if (a == null) {
            followStatus = 0;
        } else {
            followStatus = a.getFollowStatus();
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            z = TextUtils.equals(((ShareLiveContent) this.f124820p).getRoomOwnerId(), createIUserServicebyMonsterPlugin.getCurrentUserID());
        } else {
            z = false;
        }
        if (followStatus != 0 || z) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m99867l() {
        String str;
        HashMap<String, NewLiveRoomStruct> hashMap;
        NewLiveRoomStruct newLiveRoomStruct;
        C33744d dVar = new C33744d();
        String b = mo91593b();
        if (TextUtils.isEmpty(b) || (hashMap = this.f124868Q) == null || !hashMap.containsKey(b) || (newLiveRoomStruct = this.f124868Q.get(b)) == null || newLiveRoomStruct.f114488id == 0) {
            str = "end";
        } else {
            str = "live";
        }
        dVar.mo59983a("show_type", str);
        if (this.f124823s != null) {
            dVar.mo59981a("from_user_id", this.f124823s.getSender());
        }
        C39162r.m79460a("livesdk_share_chat_show", dVar.f79943a);
    }

    /* renamed from: k */
    private void m99866k() {
        UrlModel roomCover;
        this.f124856E.setVisibility(8);
        this.f124857F.setVisibility(8);
        this.f124860I.setVisibility(0);
        this.f124853B.setVisibility(8);
        this.f124862K.setText(this.itemView.getContext().getResources().getString(R.string.c9v, ((ShareLiveContent) this.f124820p).getRoomOwnerName()));
        this.f124865N.setVisibility(8);
        this.f124852A.setVisibility(0);
        RemoteImageView remoteImageView = this.f124861J;
        if (((ShareLiveContent) this.f124820p).getRoomOwnerAvatar() != null) {
            roomCover = ((ShareLiveContent) this.f124820p).getRoomOwnerAvatar();
        } else {
            roomCover = ((ShareLiveContent) this.f124820p).getRoomCover();
        }
        m99862a(remoteImageView, roomCover, 2131232877, (AbstractC24641d) null);
        m99861a(((ShareLiveContent) this.f124820p).getRoomCover(), new C11291z());
        if (m99864i()) {
            this.f124863L.setVisibility(0);
            this.f124864M.setVisibility(8);
            return;
        }
        this.f124863L.setVisibility(8);
        this.f124864M.setVisibility(0);
    }

    /* renamed from: j */
    private void m99865j() {
        boolean z;
        Set<Long> set;
        Boolean bool;
        if (this.f124820p != null && this.f124823s != null) {
            String b = mo91593b();
            if (!TextUtils.isEmpty(b)) {
                Map<String, Boolean> map = this.f124869R;
                boolean z2 = true;
                if (map == null || ((bool = map.get(b)) != null && !bool.booleanValue())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || this.f124872U) {
                    this.f124866O.setVisibility(8);
                    this.f124867P.cancel();
                    TextView textView = this.f124859H;
                    textView.setTextColor(C0643b.m2378c(textView.getContext(), R.color.l));
                    ViewGroup viewGroup = this.f124857F;
                    C0792v.m2746a(viewGroup, C0643b.m2369a(viewGroup.getContext(), (int) R.drawable.aql));
                    HashMap<String, NewLiveRoomStruct> hashMap = this.f124868Q;
                    if (hashMap == null || !hashMap.containsKey(b)) {
                        m99866k();
                    } else {
                        NewLiveRoomStruct newLiveRoomStruct = this.f124868Q.get(b);
                        if (newLiveRoomStruct == null || newLiveRoomStruct.f114488id == 0) {
                            m99866k();
                        } else {
                            this.f124857F.setVisibility(0);
                            this.f124860I.setVisibility(8);
                            this.f124853B.setVisibility(0);
                            this.f124852A.setVisibility(0);
                            this.f124865N.setVisibility(0);
                            m99861a(newLiveRoomStruct.roomCover, (AbstractC24641d) null);
                        }
                        long msgId = this.f124823s.getMsgId();
                        if (z2 && msgId != 0 && (set = this.f124871T) != null && !set.contains(Long.valueOf(msgId))) {
                            m99867l();
                            this.f124871T.add(Long.valueOf(msgId));
                            return;
                        }
                        return;
                    }
                } else {
                    this.f124866O.setVisibility(0);
                    this.f124867P.start();
                    this.f124857F.setVisibility(0);
                    this.f124860I.setVisibility(8);
                    this.f124853B.setVisibility(8);
                    this.f124865N.setVisibility(8);
                    TextView textView2 = this.f124859H;
                    textView2.setTextColor(C0643b.m2378c(textView2.getContext(), R.color.bx));
                    C0792v.m2746a(this.f124857F, (Drawable) null);
                    this.f124852A.setVisibility(8);
                }
                z2 = false;
                long msgId2 = this.f124823s.getMsgId();
                if (z2) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        this.f124873b = (LinearLayout) this.itemView.findViewById(R.id.zi);
        this.f124874x = (RemoteImageView) this.itemView.findViewById(R.id.ad1);
        this.f124875y = (TextView) this.itemView.findViewById(R.id.adk);
        this.f124876z = (TextView) this.itemView.findViewById(R.id.ada);
        this.f124852A = (RemoteImageView) this.itemView.findViewById(R.id.ad7);
        this.f124853B = (TextView) this.itemView.findViewById(R.id.adh);
        this.f124854C = (ImageView) this.itemView.findViewById(R.id.adl);
        this.f124855D = this.itemView.findViewById(R.id.adt);
        this.f124856E = (TextView) this.itemView.findViewById(R.id.ado);
        this.f124819o = C54438a.C54439a.m99780a((View) mo91563a(R.id.acq));
        this.f124857F = (ViewGroup) this.itemView.findViewById(R.id.uk);
        this.f124858G = (RemoteImageView) this.itemView.findViewById(R.id.uc);
        this.f124859H = (TextView) this.itemView.findViewById(R.id.uy);
        this.f124860I = (ViewGroup) this.itemView.findViewById(R.id.f9e);
        this.f124861J = (RemoteImageView) this.itemView.findViewById(R.id.f9c);
        this.f124862K = (TextView) this.itemView.findViewById(R.id.f9g);
        this.f124863L = (TextView) this.itemView.findViewById(R.id.f9d);
        this.f124864M = (TextView) this.itemView.findViewById(R.id.f9f);
        this.f124865N = this.itemView.findViewById(R.id.tz);
        this.f124866O = this.itemView.findViewById(R.id.cfq);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.itemView.findViewById(R.id.cg3), View.ROTATION, 0.0f, 360.0f);
        this.f124867P = ofFloat;
        ofFloat.setDuration(1000L);
        this.f124867P.setInterpolator(new LinearInterpolator());
        this.f124867P.setRepeatCount(-1);
        if (this.f124870S == null) {
            this.f124870S = new View$OnAttachStateChangeListenerC54496ak(this.itemView);
        }
    }

    public C54492ag(View view) {
        super(view);
    }

    /* renamed from: b */
    private void m99863b(View view) {
        String str;
        if (view.getId() == R.id.f9d) {
            str = "follow";
        } else if (view.getId() == R.id.f9f) {
            str = "more_video";
        } else {
            str = "others";
        }
        C33744d dVar = new C33744d();
        if (this.f124823s != null) {
            dVar.mo59981a("from_user_id", this.f124823s.getSender());
        }
        dVar.mo59983a("button_type", str);
        C39162r.m79460a("livesdk_share_chat_click", dVar.f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        this.f124876z.setOnClickListener(onClickListener);
        this.f124874x.setOnClickListener(onClickListener);
        this.f124875y.setOnClickListener(onClickListener);
        View$OnClickListenerC54493ah ahVar = new View$OnClickListenerC54493ah(this, onClickListener);
        this.f124863L.setOnClickListener(ahVar);
        this.f124864M.setOnClickListener(ahVar);
        this.f124858G.setOnClickListener(ahVar);
        this.f124859H.setOnClickListener(ahVar);
        this.f124819o.mo91506a(new View$OnClickListenerC54494ai(this));
        C55173ae.View$OnTouchListenerC55177a aVar = this.f124824t;
        C54438a aVar2 = this.f124819o;
        if (aVar2 != null) {
            aVar2.mo91508a(aVar);
        }
        this.f124824t.mo92194a(this.f124876z, this.f124874x, this.f124875y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo91590a(View view) {
        NewLiveRoomStruct newLiveRoomStruct;
        String str;
        long j;
        AbstractC58593c d;
        if (this.f124820p != null) {
            HashMap<String, NewLiveRoomStruct> hashMap = this.f124868Q;
            String str2 = null;
            if (hashMap == null || !hashMap.containsKey(mo91593b())) {
                newLiveRoomStruct = null;
            } else {
                newLiveRoomStruct = this.f124868Q.get(mo91593b());
            }
            View$OnAttachStateChangeListenerC54496ak akVar = this.f124870S;
            ShareLiveContent shareLiveContent = akVar.f124882b;
            if (shareLiveContent != null) {
                str = shareLiveContent.getRoomOwnerId();
            } else {
                str = null;
            }
            ShareLiveContent shareLiveContent2 = akVar.f124882b;
            if (shareLiveContent2 != null) {
                str2 = shareLiveContent2.getRoomSecOwnerId();
            }
            if (newLiveRoomStruct != null) {
                j = newLiveRoomStruct.f114488id;
            } else {
                j = 0;
            }
            if (!(str == null || str.length() == 0)) {
                C89233z.C89237d dVar = new C89233z.C89237d();
                dVar.element = 0;
                try {
                    dVar.element = Long.parseLong(str);
                } catch (Exception unused) {
                }
                if (!akVar.f124883c) {
                    akVar.f124883c = true;
                    ILiveOuterService s = LiveOuterService.m107269s();
                    if (s == null || (d = s.mo95830d()) == null) {
                        akVar.mo91599a(newLiveRoomStruct, false, false);
                    } else {
                        Integer num = (Integer) d.mo12981a("live_chat_enter_room_opt", (Object) 0);
                        if (num != null && num.intValue() == 1) {
                            akVar.mo91599a(newLiveRoomStruct, true, true);
                            akVar.mo91598a().mo142945a(d.mo95859a(dVar.element, str2).mo143254a(new View$OnAttachStateChangeListenerC54496ak.C54497a(akVar, dVar, str2, j, newLiveRoomStruct, str), View$OnAttachStateChangeListenerC54496ak.C54500d.f124908a));
                        } else {
                            C89233z.C89238e eVar = new C89233z.C89238e();
                            eVar.element = (T) d.mo12981a("live_chat_enter_room_opt", (Object) 0);
                            akVar.mo91598a().mo142945a(d.mo95859a(dVar.element, str2).mo143254a(new View$OnAttachStateChangeListenerC54496ak.C54498b(eVar, akVar, d, dVar, str2, j, newLiveRoomStruct, str), new View$OnAttachStateChangeListenerC54496ak.C54499c(eVar, akVar, d, dVar, str2, j, newLiveRoomStruct, str)));
                        }
                    }
                }
            }
            m99863b(view);
        }
    }

    /* renamed from: a */
    private void m99861a(UrlModel urlModel, AbstractC24641d dVar) {
        m99862a(this.f124852A, urlModel, (int) R.drawable.avh, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo91589a(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        m99863b(view);
        if (view.getId() == R.id.uc || view.getId() == R.id.uy || view.getId() == R.id.f9f) {
            C53615d.m98863a(mo91593b(), "chat", "click_head");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54560p
    /* renamed from: a */
    public final void mo91592a(HashMap<String, NewLiveRoomStruct> hashMap, HashMap<String, Boolean> hashMap2, Set<Long> set) {
        this.f124868Q = hashMap;
        this.f124869R = hashMap2;
        this.f124871T = set;
    }

    /* renamed from: a */
    private static void m99862a(RemoteImageView remoteImageView, UrlModel urlModel, int i, AbstractC24641d dVar) {
        if (urlModel == null) {
            remoteImageView.setController(null);
            ((C24246a) remoteImageView.getHierarchy()).mo39966c(i);
            return;
        }
        C55225q.m100989a(remoteImageView, urlModel, i, i, dVar);
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareLiveContent shareLiveContent, int i) {
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareLiveContent, i);
        this.f124872U = false;
        this.f124855D.setVisibility(8);
        this.f124853B.setVisibility(0);
        this.f124876z.setVisibility(8);
        this.f124854C.setVisibility(8);
        this.f124873b.setVisibility(8);
        this.f124860I.setVisibility(8);
        this.f124857F.setVisibility(0);
        this.f124856E.setVisibility(8);
        m99861a(shareLiveContent.getRoomCover(), (AbstractC24641d) null);
        C55198a.m100927a(this.f124874x, shareLiveContent.getRoomOwnerAvatar());
        m99862a(this.f124858G, shareLiveContent.getRoomOwnerAvatar(), 2131232878, (AbstractC24641d) null);
        this.f124875y.setText(shareLiveContent.getRoomOwnerName());
        this.f124859H.setText(shareLiveContent.getRoomOwnerName());
        this.f124825u.mo90246a(String.valueOf(this.f124823s.getSender()), this.f124823s.getSecSender());
        this.f124874x.setTag(50331648, 24);
        this.f124874x.setTag(100663296, shareLiveContent);
        this.f124875y.setTag(50331648, 24);
        this.f124875y.setTag(100663296, shareLiveContent);
        this.f124876z.setTag(50331648, 5);
        this.f124876z.setTag(67108864, aiVar);
        this.f124819o.mo91505a(50331648, 23);
        this.f124863L.setTag(50331648, 5);
        this.f124863L.setTag(67108864, aiVar);
        this.f124864M.setTag(50331648, 24);
        this.f124864M.setTag(100663296, shareLiveContent);
        this.f124858G.setTag(50331648, 24);
        this.f124858G.setTag(100663296, shareLiveContent);
        this.f124859H.setTag(50331648, 24);
        this.f124859H.setTag(100663296, shareLiveContent);
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String roomId = shareLiveContent.getRoomId();
        long sender = aiVar.getSender();
        C0484a aVar = new C0484a();
        aVar.put("room_id", roomId);
        aVar.put("anchor_id", roomOwnerId);
        aVar.put("action_type", "click");
        aVar.put("enter_from_merge", "chat");
        aVar.put("enter_method", "live_cover");
        aVar.put("_params_live_platform", "live");
        aVar.put("from_user_id", String.valueOf(sender));
        C39162r.m79460a("livesdk_live_show", aVar);
        View$OnAttachStateChangeListenerC54496ak akVar = this.f124870S;
        akVar.f124881a = aiVar;
        akVar.f124882b = shareLiveContent;
        String string = C17867d.m33078a().getResources().getString(R.string.fq6);
        m99865j();
        if (this.f124864M.getPaint().measureText(string) > ((float) C34728n.m70946a(106.0d))) {
            this.f124864M.setTextSize(10.0f);
        } else {
            this.f124864M.setTextSize(14.0f);
        }
    }
}
