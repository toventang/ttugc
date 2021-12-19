package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.C34606a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54848c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54856f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55054g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55097i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55120m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55161a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.BadgeTextView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.SessionStatusImageView;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.C56241d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c */
public class C55012c extends RecyclerView.ViewHolder implements AbstractC56519a, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final EmojiCompatTuxTextView f125918a;

    /* renamed from: b */
    public final AvatarImageView f125919b;

    /* renamed from: c */
    protected final EmojiCompatTuxTextView f125920c;

    /* renamed from: d */
    protected final AppCompatTextView f125921d;

    /* renamed from: e */
    protected AbstractC56237a f125922e;

    /* renamed from: f */
    public int f125923f;

    /* renamed from: g */
    private final BadgeTextView f125924g;

    /* renamed from: h */
    private final ImageView f125925h;

    /* renamed from: i */
    private final ImageView f125926i;

    /* renamed from: j */
    private final SessionStatusImageView f125927j;

    /* renamed from: k */
    private final ImageView f125928k;

    /* renamed from: l */
    private final ViewGroup f125929l;

    /* renamed from: m */
    private final ViewGroup f125930m;

    /* renamed from: n */
    private final int f125931n = Math.round(TypedValue.applyDimension(1, 56.0f, Resources.getSystem().getDisplayMetrics()));

    /* renamed from: o */
    private String f125932o;

    /* renamed from: p */
    private C56520b f125933p;

    static {
        Covode.recordClassIndex(64738);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new RunnableC90250g(C55012c.class, "onUserUpdate", C55120m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: c */
    public final void mo91969c() {
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c$3 */
    public static /* synthetic */ class C550153 {

        /* renamed from: a */
        static final /* synthetic */ int[] f125937a;

        /* renamed from: b */
        static final /* synthetic */ int[] f125938b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        static {
            /*
                r0 = 64741(0xfce5, float:9.0721E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.im.service.k.c[] r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56240c.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125938b = r1
                r4 = 1
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56240c.BLUE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r3 = 2
                int[] r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125938b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56240c.GREY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r2 = 3
                int[] r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125938b     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.im.service.k.c r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56240c.RED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.ss.android.ugc.aweme.im.service.k.e[] r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125937a = r1
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e.LEFT_DOT     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125937a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e.RIGHT_DOT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.f125937a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ss.android.ugc.aweme.im.service.k.e r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e.RIGHT_NUMBER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550153.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final void mo91967b() {
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        int c = this.f125922e.mo91860c();
        if (c == 0) {
            AbstractC56237a aVar = this.f125922e;
            AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
            AbstractC88398aa b = C88925a.m154180b(C88946a.f201991c);
            C89219l.m154716b(b, "");
            C54823a.C54830g gVar = C54823a.C54830g.f125598a;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(b, "");
            C89219l.m154721d(gVar, "");
            AbstractC88410b.m153642b(new C54823a.CallableC54831h(a, aVar, gVar)).mo142941b(b).cN_();
        } else if (c == 20) {
            AbstractC56237a aVar2 = this.f125922e;
            AbstractC17420a a2 = AbstractC17420a.C17421a.m32276a();
            AbstractC88398aa b2 = C88925a.m154180b(C88946a.f201991c);
            C89219l.m154716b(b2, "");
            C54823a.C54828e eVar = C54823a.C54828e.f125594a;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(a2, "");
            C89219l.m154721d(b2, "");
            C89219l.m154721d(eVar, "");
            AbstractC88410b.m153642b(new C54823a.CallableC54829f(a2, aVar2, eVar)).mo142941b(b2).cN_();
        }
    }

    /* renamed from: a */
    public final void mo91963a() {
        Long valueOf = Long.valueOf(AbstractC17427b.C17428a.m32311c(this.f125922e.bL_()));
        if (valueOf.longValue() > 0) {
            C55085g.m100761b(valueOf.toString(), C55080c.m100730a(this.f125922e.bL_()), new AbstractC56230a() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550142 */

                static {
                    Covode.recordClassIndex(64740);
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
                /* renamed from: a */
                public final void mo91085a(IMUser iMUser) {
                    if (iMUser != null) {
                        C55012c.this.mo91964a(iMUser.getAvatarThumb());
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
                /* renamed from: a */
                public final void mo91086a(Throwable th) {
                    C56244a.m102193e("SessionListViewHolder", "SessionType.CHAT onQueryError() ");
                    C34577e.m70591a(C55012c.this.f125919b, 2131232314);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ boolean mo91968b(AbstractC54866a aVar) {
        AbstractC56237a aVar2 = this.f125922e;
        if (aVar2 == null || aVar == null) {
            return true;
        }
        aVar.mo91875a(aVar2, 0);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo91970c(AbstractC54866a aVar) {
        AbstractC56237a aVar2 = this.f125922e;
        if (aVar2 != null && aVar != null) {
            aVar.mo91875a(aVar2, 1);
        }
    }

    /* renamed from: b */
    private void m100628b(C56241d dVar) {
        if (dVar.f128252c) {
            this.f125920c.setTuxFont(62);
            this.f125920c.setTextColor(C0643b.m2378c(this.itemView.getContext(), R.color.bx));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo91965a(AbstractC54866a aVar) {
        AbstractC56237a aVar2 = this.f125922e;
        if (aVar2 != null && aVar != null) {
            aVar.mo91875a(aVar2, 2);
        }
    }

    /* renamed from: a */
    private void m100624a(C56241d dVar) {
        Drawable drawable;
        int i = C550153.f125938b[dVar.f128251b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                drawable = C0643b.m2369a(this.itemView.getContext(), (int) R.drawable.avf);
                if (dVar.f128250a == EnumC56242e.LEFT_DOT) {
                    this.f125926i.setImageDrawable(drawable);
                    return;
                }
            } else {
                return;
            }
        } else if (dVar.f128250a == EnumC56242e.RIGHT_NUMBER) {
            this.f125924g.setBackgroundDrawable(C0643b.m2369a(this.itemView.getContext(), (int) R.drawable.arg));
            return;
        } else if (dVar.f128250a == EnumC56242e.RIGHT_DOT) {
            drawable = C0643b.m2369a(this.itemView.getContext(), (int) R.drawable.ave);
        } else {
            return;
        }
        this.f125925h.setImageDrawable(drawable);
    }

    /* renamed from: b */
    private void m100627b(AbstractC56237a aVar) {
        String str;
        int i = aVar.f128238q;
        if (i > 1 && C55054g.m100678b()) {
            str = this.itemView.getContext().getResources().getString(R.string.dd5, Integer.valueOf(i));
        } else if (aVar.mo91870g() != null) {
            str = aVar.mo91870g();
        } else {
            str = "";
        }
        C17191a.C17192a aVar2 = new C17191a.C17192a();
        aVar2.mo27177a(str);
        this.f125920c.setText(aVar2.f40973a);
        if (aVar.f128243v) {
            C46579b.m89899a(this.f125920c);
        }
    }

    /* renamed from: c */
    private void m100629c(AbstractC56237a aVar) {
        boolean z;
        String str;
        if (aVar.f128238q > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = aVar.f128239r;
        C56241d dVar = aVar.f128246y;
        StringBuilder append = new StringBuilder("hasUnreadMessages: ").append(z).append("hasUnreadLikes: ").append(z2);
        if (dVar != null) {
            str = "state: " + dVar.toString();
        } else {
            str = "";
        }
        C56244a.m102191c("SessionListViewHolder", append.append(str).append(" sessionID: ").append(aVar.bL_()).toString());
        if (dVar != null && (z || z2)) {
            m100625a(dVar, aVar);
            m100624a(dVar);
            m100628b(dVar);
        } else if (C55054g.m100679c()) {
            this.f125918a.setTuxFont(41);
        }
    }

    @AbstractC90264r
    public void onUserUpdate(C55120m mVar) {
        IMUser a;
        if (TextUtils.equals(this.f125932o, mVar.f126144a) && (a = C55085g.m100751a(mVar.f126144a, mVar.f126145b)) != null) {
            AbstractC56237a aVar = this.f125922e;
            if (aVar instanceof C54856f) {
                m100627b(aVar);
                return;
            }
            UrlModel avatarThumb = a.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C34577e.m70591a(this.f125919b, 2131232314);
            } else {
                C34577e.m70592a(this.f125919b, avatarThumb);
            }
            AbstractC56237a aVar2 = this.f125922e;
            if (aVar2 != null && !TextUtils.isEmpty(aVar2.bL_())) {
                m100626a(a, this.f125922e.bL_());
            }
            this.f125918a.setText(a.getDisplayName());
            C80581io.m139704a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f125918a);
        }
    }

    /* renamed from: a */
    public final void mo91964a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            C56244a.m102185a("SessionListViewHolder", "User has no avatar");
            C34577e.m70591a(this.f125919b, 2131232314);
            return;
        }
        final String str = urlModel.getUrlList().get(0);
        C55198a.m100930a(this.f125919b, urlModel, new AbstractC55207e() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.C550131 */

            static {
                Covode.recordClassIndex(64739);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onRelease(String str) {
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55207e
            /* renamed from: a */
            public final void mo90228a() {
                if (C55012c.this.f125923f > 0) {
                    C56244a.m102191c("SessionListViewHolder", "SessionType.CHAT onLoadSuccess() refresh count: " + C55012c.this.f125923f + " position: " + C55012c.this.getBindingAdapterPosition() + " url: " + str);
                    C55012c.this.f125923f = 0;
                }
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onFailure(String str, Throwable th) {
                if (C55012c.this.f125923f < 3) {
                    C55012c.this.mo91963a();
                    C55012c.this.f125923f++;
                } else {
                    C34577e.m70591a(C55012c.this.f125919b, 2131232314);
                }
                C56244a.m102186a("SessionListViewHolder", "SessionType.CHAT onLoadFailure()refresh count: " + C55012c.this.f125923f + " position: " + C55012c.this.getBindingAdapterPosition() + " url: " + str, th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                mo90228a();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91966a(com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a r17) {
        /*
        // Method dump skipped, instructions count: 779
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c.mo91966a(com.ss.android.ugc.aweme.im.service.k.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a
    /* renamed from: a */
    public final void mo87499a(C56520b bVar) {
        ViewGroup viewGroup;
        if (this.f125933p != bVar) {
            this.f125933p = bVar;
            if (bVar.f128860b != -1) {
                ViewGroup.LayoutParams layoutParams = this.f125919b.getLayoutParams();
                layoutParams.width = bVar.f128860b;
                layoutParams.height = bVar.f128860b;
            }
            if (bVar.f128863e != -1) {
                this.f125918a.setTuxFont(bVar.f128863e);
            }
            if (bVar.f128864f != -1) {
                this.f125918a.mo37697a((float) bVar.f128864f);
            }
            if (bVar.f128865g != -1) {
                this.f125920c.setTuxFont(bVar.f128865g);
            }
            if (bVar.f128867i != -1) {
                this.f125920c.setTextColor(bVar.f128867i);
            }
            if (!(bVar.f128868j == -1 || (viewGroup = this.f125930m) == null || !(viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))) {
                ((ViewGroup.MarginLayoutParams) this.f125930m.getLayoutParams()).topMargin = bVar.f128868j;
            }
            if (bVar.f128869k != -1) {
                AppCompatTextView appCompatTextView = this.f125921d;
                if (appCompatTextView instanceof TuxTextView) {
                    ((TuxTextView) appCompatTextView).setTuxFont(bVar.f128869k);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m100626a(IMUser iMUser, String str) {
        if (iMUser != null && TextUtils.isEmpty(iMUser.getSecUid())) {
            C55097i.m100770a(str);
        }
    }

    /* renamed from: a */
    private void m100623a(AvatarImageView avatarImageView, AbstractC56237a aVar) {
        if (aVar.f128233l instanceof UrlModel) {
            C34577e.m70592a(avatarImageView, (UrlModel) aVar.f128233l);
        } else if (aVar.f128233l instanceof C34606a) {
            C34577e.m70598a(avatarImageView, (C34606a) aVar.f128233l);
        }
        if (!TextUtils.isEmpty(aVar.mo91869f())) {
            C55161a.m100871a(this.f125919b, aVar.mo91869f());
        }
    }

    public C55012c(View view, AbstractC54866a aVar) {
        super(view);
        AvatarImageView avatarImageView = (AvatarImageView) view.findViewById(R.id.ol);
        this.f125919b = avatarImageView;
        this.f125918a = (EmojiCompatTuxTextView) view.findViewById(R.id.fa1);
        this.f125920c = (EmojiCompatTuxTextView) view.findViewById(R.id.c2s);
        this.f125921d = (AppCompatTextView) view.findViewById(R.id.c2t);
        this.f125924g = (BadgeTextView) view.findViewById(R.id.f6l);
        this.f125925h = (ImageView) view.findViewById(R.id.bz9);
        this.f125926i = (ImageView) view.findViewById(R.id.bx9);
        this.f125928k = (ImageView) view.findViewById(R.id.cp0);
        this.f125927j = (SessionStatusImageView) view.findViewById(R.id.bzm);
        this.f125929l = (ViewGroup) view.findViewById(R.id.c31);
        this.f125930m = (ViewGroup) view.findViewById(R.id.ade);
        view.setOnClickListener(new View$OnClickListenerC55016d(this, aVar));
        view.setOnLongClickListener(new View$OnLongClickListenerC55017e(this, aVar));
        avatarImageView.setOnClickListener(new View$OnClickListenerC55018f(this, aVar));
        C24250e eVar = new C24250e();
        eVar.f57500b = true;
        ((C24246a) avatarImageView.getHierarchy()).mo39959a(eVar);
        ((C24246a) avatarImageView.getHierarchy()).mo39966c(2131232314);
    }

    /* renamed from: a */
    private void m100625a(C56241d dVar, AbstractC56237a aVar) {
        int i = C550153.f125937a[dVar.f128250a.ordinal()];
        if (i == 1) {
            this.f125926i.setVisibility(0);
            this.f125927j.setVisibility(8);
        } else if (i != 2) {
            this.f125924g.setBadgeCount(aVar.f128238q);
            if (!(aVar instanceof C54848c) || !C56202c.m102111a()) {
                this.f125924g.setVisibility(0);
            } else {
                this.f125924g.setVisibility(8);
            }
        } else if (!(aVar instanceof C54848c) || !C56202c.m102111a()) {
            this.f125925h.setVisibility(0);
        } else {
            this.f125925h.setVisibility(8);
        }
    }
}
