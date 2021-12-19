package com.bytedance.android.livesdk.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.event.C8455h;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

public class LiveMaskLayerWidget extends LiveWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    public AbstractC11652i.AbstractC11653a f27212a;

    /* renamed from: b */
    public Room f27213b;

    /* renamed from: c */
    public AbstractC2717b f27214c;

    /* renamed from: d */
    private LiveTextView f27215d;

    /* renamed from: e */
    private LiveTextView f27216e;

    /* renamed from: f */
    private LiveTextView f27217f;

    /* renamed from: g */
    private LiveTextView f27218g;

    static {
        Covode.recordClassIndex(13001);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bg8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo18175a() {
        show();
        AbstractC2717b bVar = this.f27214c;
        if (bVar != null) {
            bVar.stop(false);
        }
    }

    /* renamed from: b */
    public final void mo18177b() {
        hide();
        AbstractC2717b bVar = this.f27214c;
        if (bVar != null) {
            bVar.start();
        }
    }

    /* renamed from: c */
    private void m20136c() {
        Room room = this.f27213b;
        if (room != null && room.maskLayer != null) {
            m20135a(this.f27215d, this.f27213b.maskLayer.title);
            m20135a(this.f27216e, this.f27213b.maskLayer.subTitle);
            LiveTextView liveTextView = this.f27217f;
            if (liveTextView != null) {
                liveTextView.setText(this.context.getString(R.string.e1x));
            }
            LiveTextView liveTextView2 = this.f27218g;
            if (liveTextView2 != null) {
                liveTextView2.setText(this.context.getString(R.string.ed_));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f27215d = (LiveTextView) this.contentView.findViewById(R.id.cin);
        this.f27216e = (LiveTextView) this.contentView.findViewById(R.id.cil);
        this.f27217f = (LiveTextView) this.contentView.findViewById(R.id.cio);
        this.f27218g = (LiveTextView) this.contentView.findViewById(R.id.cik);
        this.contentView.findViewById(R.id.cio).setOnClickListener(this);
        this.contentView.findViewById(R.id.cik).setOnClickListener(this);
        C6779a.m14563a().mo13052a(C8455h.class).mo143289d(new AbstractC88433f<C8455h>() {
            /* class com.bytedance.android.livesdk.widget.LiveMaskLayerWidget.C113501 */

            static {
                Covode.recordClassIndex(13002);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C8455h hVar) {
                C8455h hVar2 = hVar;
                if (hVar2 != null && LiveMaskLayerWidget.this.f27213b != null && hVar2.f20904a == LiveMaskLayerWidget.this.f27213b.getId()) {
                    if (hVar2.f20905b) {
                        LiveMaskLayerWidget.this.mo18175a();
                    } else {
                        LiveMaskLayerWidget.this.mo18177b();
                    }
                }
            }
        });
        m20136c();
    }

    /* renamed from: a */
    public final void mo18176a(Room room) {
        this.f27213b = room;
        m20136c();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cio) {
            AbstractC11652i.AbstractC11653a aVar = this.f27212a;
            if (aVar != null) {
                aVar.mo12712m();
            }
            C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12651a("click_icon", "watch").mo12661f("click").mo12643a(provideDataChannel()).mo12655b();
        } else if (id == R.id.cik) {
            AbstractC11652i.AbstractC11653a aVar2 = this.f27212a;
            if (aVar2 != null) {
                aVar2.mo12713n();
            }
            C6501b.C6502a.m13948a("livesdk_mask_layer_click").mo12651a("click_icon", "skip").mo12661f("click").mo12643a(provideDataChannel()).mo12655b();
        }
    }

    /* renamed from: a */
    private static void m20135a(TextView textView, C9698b bVar) {
        String str;
        if (textView != null && bVar != null) {
            String str2 = bVar.f23646b;
            if (!TextUtils.isEmpty(bVar.f23645a)) {
                str = C8983b.m17319a().mo15219a(bVar.f23645a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            textView.setText(C7557c.m15540a(str2, bVar, null));
        }
    }
}
