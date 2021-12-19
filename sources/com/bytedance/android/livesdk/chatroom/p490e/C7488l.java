package com.bytedance.android.livesdk.chatroom.p490e;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.DecoTextModifyFrequencySetting;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9720cd;
import com.bytedance.android.livesdk.model.message.C9885o;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.l */
public class C7488l extends AbstractC7501r<AbstractC7490a> implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: e */
    private static final String f18602e = C7488l.class.getSimpleName();

    /* renamed from: a */
    public WeakHandler f18603a = new WeakHandler(this);

    /* renamed from: b */
    public long f18604b;

    /* renamed from: c */
    public String f18605c;

    /* renamed from: d */
    public boolean f18606d;

    /* renamed from: f */
    private boolean f18607f;

    /* renamed from: g */
    private long f18608g;

    /* renamed from: h */
    private String f18609h;

    /* renamed from: i */
    private int f18610i = DecoTextModifyFrequencySetting.INSTANCE.getValue();

    /* renamed from: j */
    private int f18611j;

    /* renamed from: k */
    private boolean f18612k = true;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.l$a */
    public interface AbstractC7490a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8260);
        }

        /* renamed from: a */
        void mo13733a();

        /* renamed from: a */
        void mo13734a(C9537au auVar);

        /* renamed from: a */
        void mo13735a(String str);

        /* renamed from: a */
        void mo13736a(List<C9537au> list);

        /* renamed from: b */
        void mo13737b();

        /* renamed from: b */
        void mo13738b(String str);

        /* renamed from: c */
        void mo13739c();
    }

    static {
        Covode.recordClassIndex(8258);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.l$1 */
    static /* synthetic */ class C74891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18613a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 8259(0x2043, float:1.1573E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.message.a.a[] r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.chatroom.p490e.C7488l.C74891.f18613a = r2
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.REMIND     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.chatroom.p490e.C7488l.C74891.f18613a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.MODIFY_DECORATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.chatroom.p490e.C7488l.C74891.f18613a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.MODIFY_STICKER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p490e.C7488l.C74891.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final boolean mo13732a() {
        if (this.f18611j < this.f18610i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m15426a(int i) {
        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
        if (context == null) {
            return "";
        }
        String string = context.getString(i);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public final String mo13729a(C9537au auVar) {
        if (!TextUtils.isEmpty(this.f18609h)) {
            return this.f18609h;
        }
        if (auVar != null) {
            return auVar.f23162d;
        }
        return "";
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7490a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(EnumC9596a.MODIFY_DECORATION.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.MODIFY_STICKER.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.REMIND.getIntType(), this);
        }
        boolean z = this.f18607f;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && this.f38654y != null) {
            if (26 == message.what) {
                this.f18606d = false;
            }
            if (26 != message.what) {
                return;
            }
            if (message.obj instanceof DecorationTextAuditResult) {
                DecorationTextAuditResult decorationTextAuditResult = (DecorationTextAuditResult) message.obj;
                if (this.f38654y != null && decorationTextAuditResult != null) {
                    if (31 == decorationTextAuditResult.getAuditStatus()) {
                        this.f18609h = "";
                        C6806c.m14603a((C6800c) AbstractC6804a.f16904aF, (Object) 31);
                        C6806c.m14603a(AbstractC6804a.f16903aE, "");
                        ((AbstractC7490a) this.f38654y).mo13737b();
                        String auditNotPassWarnText = decorationTextAuditResult.getAuditNotPassWarnText();
                        if (TextUtils.isEmpty(auditNotPassWarnText)) {
                            auditNotPassWarnText = m15426a((int) R.string.gjq);
                        }
                        ((AbstractC7490a) this.f38654y).mo13735a(auditNotPassWarnText);
                        this.f18612k = true;
                        return;
                    }
                    if (this.f18612k) {
                        this.f18611j++;
                        this.f18609h = this.f18605c;
                        ((AbstractC7490a) this.f38654y).mo13738b(this.f18609h);
                        ((AbstractC7490a) this.f38654y).mo13733a();
                    } else {
                        this.f18612k = true;
                    }
                    C6806c.m14603a(AbstractC6804a.f16904aF, Integer.valueOf(decorationTextAuditResult.getAuditStatus()));
                    C6806c.m14603a(AbstractC6804a.f16903aE, this.f18609h);
                }
            } else if (message.obj instanceof C2912a) {
                ((AbstractC7490a) this.f38654y).mo13735a(((C2912a) message.obj).getPrompt());
            } else {
                ((AbstractC7490a) this.f38654y).mo13735a(m15426a((int) R.string.gjr));
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        int i = C74891.f18613a[((C11777a) iMessage).f28131L.ordinal()];
        if (i == 1) {
            C9688bt btVar = (C9688bt) iMessage;
            if (btVar.f23579f == 1 && this.f38654y != null) {
                this.f18609h = "";
                C6806c.m14603a((C6800c) AbstractC6804a.f16904aF, (Object) 31);
                C6806c.m14603a(AbstractC6804a.f16903aE, "");
                ((AbstractC7490a) this.f38654y).mo13737b();
                ((AbstractC7490a) this.f38654y).mo13735a(btVar.f23578a);
            }
        } else if (i != 2) {
            if (i == 3 && this.f38654y != null && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) {
                C9720cd cdVar = (C9720cd) iMessage;
                if (C13603b.m24435a((Collection) cdVar.f23693a)) {
                    ((AbstractC7490a) this.f38654y).mo13739c();
                } else {
                    ((AbstractC7490a) this.f38654y).mo13734a(cdVar.f23693a.get(0));
                }
            }
        } else if (this.f38654y != null) {
            ((AbstractC7490a) this.f38654y).mo13736a(((C9885o) iMessage).f23890a);
        }
    }

    /* renamed from: a */
    public final void mo13731a(HashMap<String, String> hashMap, int i) {
        ((DecorationApi) C5805e.m12718a().mo11572a(DecorationApi.class)).setDecoration(this.f18604b, i, hashMap).mo143271a(new C11191f()).mo143254a(C11195i.f26824b, new C7491m(this));
    }

    public C7488l(long j, long j2, boolean z) {
        this.f18604b = j;
        this.f18608g = j2;
        this.f18607f = z;
    }
}
