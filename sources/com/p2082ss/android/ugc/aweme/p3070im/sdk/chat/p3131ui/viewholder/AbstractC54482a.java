package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.AbstractC54262f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.C54252d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55120m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55161a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a */
public abstract class AbstractC54482a<CONTENT extends BaseContent> extends RecyclerView.ViewHolder implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private TextView f124805a;

    /* renamed from: b */
    private TextView f124806b;

    /* renamed from: c */
    public int f124807c = 7;

    /* renamed from: d */
    protected int f124808d;

    /* renamed from: e */
    public AvatarImageView f124809e;

    /* renamed from: f */
    public TuxCheckBox f124810f;

    /* renamed from: g */
    public FrameLayout f124811g;

    /* renamed from: h */
    public TextView f124812h;

    /* renamed from: i */
    protected TextView f124813i;

    /* renamed from: j */
    protected TuxIconView f124814j;

    /* renamed from: k */
    public View f124815k;

    /* renamed from: l */
    public AbstractC54262f f124816l;

    /* renamed from: m */
    protected String f124817m;

    /* renamed from: n */
    protected String f124818n;

    /* renamed from: o */
    protected C54438a f124819o;

    /* renamed from: p */
    protected CONTENT f124820p;

    /* renamed from: q */
    public int f124821q;

    /* renamed from: r */
    protected SystemContent f124822r;

    /* renamed from: s */
    public C19538ai f124823s;

    /* renamed from: t */
    protected C55173ae.View$OnTouchListenerC55177a f124824t;

    /* renamed from: u */
    protected C53701d.C53702a f124825u;

    /* renamed from: v */
    public String f124826v;

    /* renamed from: w */
    int[] f124827w = new int[2];

    /* renamed from: x */
    private final GestureDetector.SimpleOnGestureListener f124828x;

    /* renamed from: y */
    private GestureDetector f124829y;

    static {
        Covode.recordClassIndex(64193);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo91567a(C19538ai aiVar) {
    }

    /* access modifiers changed from: protected */
    public AbstractC89172b<Boolean, C89391z> bI_() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void bJ_() {
    }

    /* access modifiers changed from: protected */
    public void bK_() {
    }

    /* renamed from: g */
    public void mo91578g() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new RunnableC90250g(AbstractC54482a.class, "onUserUpdate", C55120m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo91571a(C53709a aVar) {
        ViewGroup viewGroup = (ViewGroup) mo91563a((int) R.id.cd2);
        if (viewGroup != null) {
            int i = this.f124807c;
            AbstractC89172b<Boolean, C89391z> bI_ = bI_();
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            this.f124816l = new C54252d(viewGroup, i, bI_);
        }
    }

    /* renamed from: a */
    public void mo91572a(IMUser iMUser, C19538ai aiVar) {
        this.f124826v = null;
        if (iMUser != null) {
            mo91569a(aiVar, iMUser);
            TextView textView = this.f124812h;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (aiVar != null) {
            this.f124826v = String.valueOf(aiVar.getSender());
            C55085g.m100751a(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        }
    }

    /* renamed from: f */
    public final void mo91577f() {
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* renamed from: e */
    public final void mo91576e() {
        if (!TextUtils.isEmpty(this.f124826v) && !EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        if (this.f124813i != null) {
            CONTENT content = this.f124820p;
            if (content == null || content.getExtContent() == null) {
                SystemContent systemContent = this.f124822r;
                if (systemContent != null) {
                    C53701d.m98973a(systemContent);
                    return;
                }
                return;
            }
            C53701d.m98973a(this.f124820p.getExtContent());
        }
    }

    /* renamed from: h */
    public final void mo91579h() {
        GestureDetector gestureDetector = this.f124829y;
        if (gestureDetector != null) {
            C54438a aVar = this.f124819o;
            if (aVar != null) {
                C89219l.m154721d(gestureDetector, "");
                aVar.f124697c.setOnTouchListener(new C54438a.View$OnTouchListenerC54440b(aVar, gestureDetector));
                return;
            }
            C56244a.m102191c("IMBaseViewHolder", "confirmClickListener fail with type:" + this.f124807c);
            return;
        }
        C51423a.m95786a((Exception) new IllegalStateException("confirmClickListener but gestureDetector is null"));
    }

    /* renamed from: a */
    public void mo91007a() {
        this.f124813i = (TextView) mo91563a((int) R.id.cu0);
        this.f124806b = (TextView) mo91563a((int) R.id.cmj);
        this.f124812h = (TextView) mo91563a((int) R.id.fa1);
        this.f124809e = (AvatarImageView) mo91563a((int) R.id.on);
        this.f124815k = (View) mo91563a((int) R.id.ffl);
        this.f124810f = (TuxCheckBox) mo91563a((int) R.id.a2o);
        this.f124811g = (FrameLayout) mo91563a((int) R.id.c69);
        this.f124805a = (TextView) mo91563a((int) R.id.f9m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo91563a(int i) {
        T t = (T) this.itemView.findViewById(i);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m99818b(C19538ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        if (aiVar.getMsgStatus() == 2 || aiVar.getMsgStatus() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        AvatarImageView avatarImageView = this.f124809e;
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(onClickListener);
        }
        C54438a aVar = this.f124819o;
        if (aVar != null) {
            aVar.mo91506a(onClickListener);
        }
    }

    /* renamed from: a */
    public void mo91565a(View.OnLongClickListener onLongClickListener) {
        AvatarImageView avatarImageView = this.f124809e;
        if (avatarImageView != null) {
            avatarImageView.setOnLongClickListener(onLongClickListener);
        }
        C54438a aVar = this.f124819o;
        if (aVar != null) {
            aVar.mo91507a(onLongClickListener);
        }
    }

    public AbstractC54482a(View view) {
        super(view);
        C544831 r2 = new GestureDetector.SimpleOnGestureListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a.C544831 */

            static {
                Covode.recordClassIndex(64194);
            }

            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return true;
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return super.onSingleTapUp(motionEvent);
            }

            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (AbstractC54482a.this.f124816l == null) {
                    return true;
                }
                AbstractC54482a.this.f124816l.mo91336a(motionEvent.getRawX(), motionEvent.getRawY());
                return true;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C56244a.m102191c("DmHelper", "onSingleTapConfirmed called");
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                AbstractC54482a aVar = AbstractC54482a.this;
                View view = aVar.f124819o.f124697c;
                view.getLocationOnScreen(aVar.f124827w);
                int i = aVar.f124827w[0];
                int i2 = aVar.f124827w[1];
                int width = view.getWidth();
                int height = view.getHeight();
                if (rawX >= i && rawX <= i + width && rawY >= i2 && rawY <= i2 + height) {
                    View.OnClickListener onClickListener = AbstractC54482a.this.f124819o.f124695a;
                    C56244a.m102191c("DmHelper", "onSingleTapConfirmed called:".concat(String.valueOf(onClickListener)));
                    if (onClickListener != null) {
                        onClickListener.onClick(AbstractC54482a.this.f124819o.f124697c);
                    }
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        };
        this.f124828x = r2;
        this.f124829y = null;
        Context context = this.itemView.getContext();
        this.f124821q = 0;
        this.f124808d = (int) C13628n.m24520b(context, 8.0f);
        this.f124824t = new C55173ae.View$OnTouchListenerC55177a();
        this.f124829y = new GestureDetector(context, r2);
        this.f124825u = C53701d.m98971a(C0643b.m2378c(context, R.color.b9), this.f124817m, this.f124818n, false);
        mo91007a();
        bJ_();
    }

    @AbstractC90264r
    public void onUserUpdate(C55120m mVar) {
        IMUser a;
        if (TextUtils.equals(this.f124826v, mVar.f126144a) && (a = C55085g.m100751a(mVar.f126144a, mVar.f126145b)) != null) {
            UrlModel avatarThumb = a.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C34577e.m70591a(this.f124809e, 2131232314);
            } else {
                C55198a.m100927a(this.f124809e, avatarThumb);
            }
            this.f124812h.setText(a.getDisplayName());
        }
    }

    /* renamed from: a */
    public final void mo91566a(View.OnTouchListener onTouchListener) {
        AvatarImageView avatarImageView = this.f124809e;
        if (avatarImageView != null) {
            avatarImageView.setOnTouchListener(onTouchListener);
        }
        C54438a aVar = this.f124819o;
        if (aVar != null) {
            aVar.mo91508a(onTouchListener);
        }
    }

    /* renamed from: a */
    public static void m99817a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo91568a(C19538ai aiVar, ReferenceInfo referenceInfo) {
        if (referenceInfo != null) {
            C56244a.m102191c("IMBaseViewHolder", "bindReplyMessage not implemented");
        }
    }

    /* renamed from: a */
    public final void mo91569a(C19538ai aiVar, IMContact iMContact) {
        AvatarImageView avatarImageView = this.f124809e;
        if (avatarImageView != null) {
            avatarImageView.setTag(67108864, String.valueOf(aiVar.getSender()));
            this.f124809e.setTag(50331648, 3);
            this.f124824t.mo92194a(this.f124809e);
            C55198a.m100927a(this.f124809e, iMContact.getDisplayAvatar());
            C55161a.m100872a(this.f124809e, iMContact);
        }
    }

    /* renamed from: a */
    public final void mo91570a(C19538ai aiVar, boolean z) {
        if (this.f124816l != null) {
            aiVar.isSelf();
            C56244a.m102190b("DmHelper", "bindLikedStatusForDm dmLikePanel :" + this.f124807c);
            this.f124816l.mo91337a(aiVar, z);
            return;
        }
        C56244a.m102190b("DmHelper", "dmLikePanel is null. do nothing:" + this.f124807c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014a A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91008a(final com.bytedance.p1399im.core.p1408d.C19538ai r10, com.bytedance.p1399im.core.p1408d.C19538ai r11, CONTENT r12, int r13) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a.mo91008a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
    }
}
