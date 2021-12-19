package com.bytedance.android.live.design.view.sheet;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;

public class LiveBaseSheetDialog extends LiveBottomSheetDialog implements AbstractC33974au {

    /* renamed from: a */
    LiveSheetHandleView f11373a;

    /* renamed from: i */
    private View f11374i;

    /* renamed from: j */
    private View f11375j;

    /* renamed from: k */
    private TextView f11376k;

    /* renamed from: l */
    private CharSequence f11377l;

    /* renamed from: m */
    private boolean f11378m;

    /* renamed from: n */
    private View f11379n;

    /* renamed from: o */
    private int f11380o;

    /* renamed from: p */
    private boolean f11381p;

    static {
        Covode.recordClassIndex(4647);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: c */
    private void m9936c() {
        setTitle(this.f11377l);
        m9935b(this.f11378m);
    }

    /* renamed from: b */
    private void m9935b(boolean z) {
        int i;
        this.f11378m = z;
        View view = this.f11375j;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9569a(boolean z) {
        int i;
        this.f11381p = z;
        LiveSheetHandleView liveSheetHandleView = this.f11373a;
        if (liveSheetHandleView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            liveSheetHandleView.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.DialogC0240h
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.f11379n;
        if (view != null) {
            setContentView(view);
            return;
        }
        int i = this.f11380o;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m9934a((View) null, i, new ViewGroup.LayoutParams(-1, -1)));
        m9936c();
    }

    @Override // androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f11377l = charSequence;
        TextView textView = this.f11376k;
        if (textView != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                this.f11374i.setVisibility(8);
            } else {
                this.f11374i.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m9934a(view, 0, new ViewGroup.LayoutParams(-1, -1)));
        m9936c();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, androidx.appcompat.app.DialogC0240h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m9934a(view, 0, layoutParams));
        m9936c();
    }

    /* renamed from: a */
    private View m9934a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(8739);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aji, (ViewGroup) null);
        this.f11374i = inflate.findViewById(R.id.dzm);
        View findViewById = inflate.findViewById(R.id.dzn);
        this.f11375j = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC4113a(this));
        this.f11376k = (TextView) inflate.findViewById(R.id.dzo);
        this.f11373a = (LiveSheetHandleView) inflate.findViewById(R.id.dzl);
        mo9569a(this.f11381p);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.dzf);
        if (view == null && i != 0) {
            view = C1764a.m5927a(getLayoutInflater(), i, viewGroup, false);
        }
        if (layoutParams == null) {
            viewGroup.addView(view, -1, -1);
        } else {
            viewGroup.addView(view, layoutParams);
        }
        this.f11373a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog.View$OnLayoutChangeListenerC41021 */

            static {
                Covode.recordClassIndex(4648);
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (LiveBaseSheetDialog.this.mo9590b().f11416n == 3) {
                    LiveBaseSheetDialog.this.f11373a.setOffset(1.0f);
                } else {
                    LiveBaseSheetDialog.this.f11373a.setOffset(0.0f);
                }
                LiveBaseSheetDialog.this.f11373a.removeOnLayoutChangeListener(this);
            }
        });
        mo9590b().mo9574a(new LiveBottomSheetBehavior.AbstractC4107a() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog.C41032 */

            static {
                Covode.recordClassIndex(4649);
            }

            @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a
            /* renamed from: a */
            public final void mo9572a(View view, int i) {
            }

            @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a
            /* renamed from: a */
            public final void mo9571a(View view, float f) {
                LiveBaseSheetDialog.this.f11373a.setOffset(Math.max(f, 0.0f));
            }
        });
        MethodCollector.m26664o(8739);
        return inflate;
    }
}
