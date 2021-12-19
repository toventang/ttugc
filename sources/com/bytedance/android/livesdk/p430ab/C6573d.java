package com.bytedance.android.livesdk.p430ab;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p481b.EnumC7303c;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p561j.C9067cf;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p689e.C11753c;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.android.message.AbstractC11888a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.ab.d */
public final class C6573d implements AbstractC11888a {

    /* renamed from: a */
    public final C10935a f16445a;

    /* renamed from: b */
    final DataChannel f16446b;

    /* renamed from: c */
    final AbstractC5788t f16447c;

    /* renamed from: d */
    final View f16448d;

    /* renamed from: e */
    final AbstractC89172b<Boolean, C89391z> f16449e;

    /* renamed from: f */
    final AbstractC89172b<C9688bt, C89391z> f16450f;

    /* renamed from: g */
    final AbstractC89171a<Boolean> f16451g;

    /* renamed from: h */
    final AbstractC89171a<C89391z> f16452h;

    /* renamed from: i */
    private final AbstractC89244h f16453i = C11831d.m20835a(C6575a.f16454a);

    /* renamed from: com.bytedance.android.livesdk.ab.d$b */
    final /* synthetic */ class C6576b implements AbstractC6572c {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f16455a;

        static {
            Covode.recordClassIndex(7312);
        }

        C6576b(AbstractC89172b bVar) {
            this.f16455a = bVar;
        }

        @Override // com.bytedance.android.livesdk.p430ab.AbstractC6572c
        /* renamed from: a */
        public final /* synthetic */ void mo12733a(AbstractC6571a aVar) {
            C89219l.m154716b(this.f16455a.invoke(aVar), "");
        }
    }

    static {
        Covode.recordClassIndex(7309);
    }

    /* renamed from: c */
    private final C6580f m14071c() {
        return (C6580f) this.f16453i.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.ab.d$a */
    static final class C6575a extends AbstractC89220m implements AbstractC89171a<C6580f> {

        /* renamed from: a */
        public static final C6575a f16454a = new C6575a();

        static {
            Covode.recordClassIndex(7311);
        }

        C6575a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6580f invoke() {
            return new C6580f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Room mo12734a() {
        return (Room) this.f16446b.mo28318b(C9093de.class);
    }

    @Override // com.bytedance.android.message.AbstractC11888a
    /* renamed from: b */
    public final void mo12735b() {
        C6580f c = m14071c();
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c);
        }
        c.f16460a = null;
    }

    /* renamed from: com.bytedance.android.livesdk.ab.d$c */
    static final class View$OnClickListenerC6577c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6573d f16456a;

        /* renamed from: b */
        final /* synthetic */ C9688bt f16457b;

        static {
            Covode.recordClassIndex(7313);
        }

        View$OnClickListenerC6577c(C6573d dVar, C9688bt btVar) {
            this.f16456a = dVar;
            this.f16457b = btVar;
        }

        public final void onClick(View view) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f16456a.f16445a.getContext();
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b(this.f16457b.f23585l);
            b.f17379c = true;
            webViewManager.mo13248a(context, b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ab.d$d */
    static final class DialogInterface$OnClickListenerC6578d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6573d f16458a;

        static {
            Covode.recordClassIndex(7314);
        }

        DialogInterface$OnClickListenerC6578d(C6573d dVar) {
            this.f16458a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6558k.m14024a(this.f16458a.f16445a.getActivity());
            dialogInterface.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.bytedance.android.livesdk.model.message.bt, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6573d(C10935a aVar, DataChannel dataChannel, AbstractC5788t tVar, View view, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89172b<? super C9688bt, C89391z> bVar2, AbstractC89171a<Boolean> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f16445a = aVar;
        this.f16446b = dataChannel;
        this.f16447c = tVar;
        this.f16448d = view;
        this.f16449e = bVar;
        this.f16450f = bVar2;
        this.f16451g = aVar2;
        this.f16452h = aVar3;
        C6580f c = m14071c();
        c.f16460a = new C6576b(new AbstractC89172b<AbstractC6571a, C89391z>(this) {
            /* class com.bytedance.android.livesdk.p430ab.C6573d.C65741 */

            static {
                Covode.recordClassIndex(7310);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC6571a aVar) {
                EnumC9596a aVar2;
                long j;
                AbstractC89172b<C9688bt, C89391z> bVar;
                AbstractC6571a aVar3 = aVar;
                C6573d dVar = (C6573d) this.receiver;
                if (!(!dVar.f16445a.isViewValid() || aVar3 == null || (aVar2 = aVar3.f28131L) == null)) {
                    boolean z = true;
                    switch (C6579e.f16459a[aVar2.ordinal()]) {
                        case 1:
                            Room a = dVar.mo12734a();
                            if (a != null) {
                                j = a.getId();
                            } else {
                                j = 0;
                            }
                            if (aVar3.mo18721a(j)) {
                                DataChannel dataChannel = dVar.f16446b;
                                Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.MemberMessage");
                                dataChannel.mo28315b(C9067cf.class, aVar3);
                                break;
                            }
                            break;
                        case 2:
                            Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.RemindMessage");
                            C9688bt btVar = (C9688bt) aVar3;
                            int i = btVar.f23579f;
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if ((i == 6 || i == 7) && (bVar = dVar.f16450f) != null) {
                                            bVar.invoke(btVar);
                                            break;
                                        }
                                    } else {
                                        Spannable spannable = C7557c.f18769a;
                                        if (btVar.mo12726a()) {
                                            spannable = C7557c.m15538a(btVar.f28134O.f28144j, "");
                                        }
                                        if (spannable == C7557c.f18769a && !TextUtils.isEmpty(btVar.f23578a)) {
                                            spannable = new SpannableString(btVar.f23578a);
                                        }
                                        CharSequence a2 = C7557c.m15538a(btVar.f23581h, "");
                                        CharSequence a3 = C7557c.m15538a(btVar.f23582i, "");
                                        C89219l.m154716b(a3, "");
                                        Spannable a4 = C7557c.m15538a(btVar.f23583j, "");
                                        C89219l.m154716b(a4, "");
                                        Spannable a5 = C7557c.m15538a(btVar.f23584k, "");
                                        C89219l.m154716b(a5, "");
                                        if (TextUtils.isEmpty(a2)) {
                                            a3 = spannable;
                                        } else if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
                                            a3 = C89361p.m154854b("\n                            " + a3 + "\n                            " + ((CharSequence) a4) + "\n                            ");
                                        } else if (TextUtils.isEmpty(a3)) {
                                            if (!TextUtils.isEmpty(a4)) {
                                                a3 = a4;
                                            } else {
                                                a3 = "";
                                            }
                                        }
                                        if (!TextUtils.isEmpty(a3)) {
                                            if (TextUtils.isEmpty(a2)) {
                                                a2 = C3966y.m9657a((int) R.string.eay);
                                            }
                                            if (TextUtils.isEmpty(a5) || TextUtils.isEmpty(btVar.f23585l)) {
                                                z = false;
                                            }
                                            DialogC9148b.C9149a aVar4 = new DialogC9148b.C9149a(dVar.f16445a.getActivity());
                                            aVar4.f22256m = false;
                                            aVar4.f22244a = a2;
                                            aVar4.f22246c = a3;
                                            DialogC9148b.C9149a a6 = aVar4.mo15244a(R.string.e3m, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6578d(dVar), false);
                                            C89219l.m154716b(a6, "");
                                            if (z) {
                                                a6.mo15246a(a5, new View$OnClickListenerC6577c(dVar, btVar));
                                                a6.f22248e = 2131234562;
                                            }
                                            a6.mo15247a().show();
                                            C6558k.m14024a(dVar.f16445a.getActivity());
                                            break;
                                        }
                                    }
                                } else {
                                    if (!dVar.f16451g.invoke().booleanValue()) {
                                        dVar.f16448d.setVisibility(8);
                                    }
                                    AbstractC89172b<Boolean, C89391z> bVar2 = dVar.f16449e;
                                    if (bVar2 != null) {
                                        bVar2.invoke(false);
                                    }
                                    Room a7 = dVar.mo12734a();
                                    if (a7 != null) {
                                        a7.setMosaicStatus(0);
                                    }
                                    AbstractC5788t tVar = dVar.f16447c;
                                    if (tVar != null) {
                                        tVar.mo8524a(btVar);
                                        break;
                                    }
                                }
                            } else {
                                Object b = dVar.f16446b.mo28318b(C9119ed.class);
                                if (b == null) {
                                    C89219l.m154715b();
                                }
                                if (!((Boolean) b).booleanValue()) {
                                    dVar.f16448d.setVisibility(0);
                                }
                                AbstractC89172b<Boolean, C89391z> bVar3 = dVar.f16449e;
                                if (bVar3 != null) {
                                    bVar3.invoke(true);
                                }
                                Room a8 = dVar.mo12734a();
                                if (a8 != null) {
                                    a8.setMosaicStatus(1);
                                }
                                AbstractC5788t tVar2 = dVar.f16447c;
                                if (tVar2 != null) {
                                    tVar2.mo8524a(btVar);
                                }
                                dVar.f16446b.mo28320c(C11753c.class, true);
                                break;
                            }
                            break;
                        case 3:
                            Room a9 = dVar.mo12734a();
                            if (a9 == null || !a9.isOfficial()) {
                                dVar.f16452h.invoke();
                                EnumC7303c.INSTANCE.addFollowGuideMessage(dVar.mo12734a(), aVar3);
                                break;
                            }
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            Room a10 = dVar.mo12734a();
                            if (a10 == null || !a10.isOfficial()) {
                                EnumC7303c.INSTANCE.add(aVar3);
                                break;
                            }
                    }
                }
                return C89391z.f203057a;
            }
        });
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.MEMBER.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.ROOM_NOTIFY.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.REMIND.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.COMMON_TOAST.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.FOLLOW_GUIDE.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.GUIDE_MESSAGE.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.COMMON_GUIDE.getIntType(), c);
            iMessageManager.addMessageListener(EnumC9596a.CEREMONY_MESSAGE.getIntType(), c);
        }
    }
}
