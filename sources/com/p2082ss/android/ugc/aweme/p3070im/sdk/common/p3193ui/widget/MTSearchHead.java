package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead */
public final class MTSearchHead extends LinearLayout {

    /* renamed from: e */
    public static final C55317a f126468e = new C55317a((byte) 0);

    /* renamed from: a */
    public final EditText f126469a;

    /* renamed from: b */
    public final ImageView f126470b;

    /* renamed from: c */
    public ShareDialogViewModel f126471c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f126472d;

    /* renamed from: f */
    private final View f126473f;

    static {
        Covode.recordClassIndex(65074);
    }

    public MTSearchHead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.MTSearchHead$a */
    public static final class C55317a {
        static {
            Covode.recordClassIndex(65080);
        }

        private C55317a() {
        }

        public /* synthetic */ C55317a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo92364a() {
        this.f126469a.clearFocus();
        KeyboardUtils.m70897c(this.f126469a);
    }

    public final void setEditClickCallBack(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f126472d = aVar;
    }

    public final void setListViewModel(ShareDialogViewModel shareDialogViewModel) {
        C89219l.m154721d(shareDialogViewModel, "");
        this.f126471c = shareDialogViewModel;
    }

    private /* synthetic */ MTSearchHead(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MTSearchHead(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4544);
        View inflate = View.inflate(context, R.layout.a7v, this);
        C89219l.m154716b(inflate, "");
        this.f126473f = inflate;
        View findViewById = inflate.findViewById(R.id.drm);
        C89219l.m154716b(findViewById, "");
        EditText editText = (EditText) findViewById;
        this.f126469a = editText;
        View findViewById2 = inflate.findViewById(R.id.x7);
        C89219l.m154716b(findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f126470b = imageView;
        editText.setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead.View$OnKeyListenerC553121 */

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f126474a;

            static {
                Covode.recordClassIndex(65075);
            }

            {
                this.f126474a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                ShareDialogViewModel shareDialogViewModel;
                List<? extends IMContact> list;
                String c;
                if (i == 66) {
                    this.f126474a.mo92364a();
                    return true;
                } else if (i != 67) {
                    return false;
                } else {
                    C89219l.m154716b(keyEvent, "");
                    if (keyEvent.getAction() != 1 || ((shareDialogViewModel = this.f126474a.f126471c) != null && (c = shareDialogViewModel.mo93017c()) != null && c.length() != 0)) {
                        return false;
                    }
                    ShareDialogViewModel shareDialogViewModel2 = this.f126474a.f126471c;
                    if (shareDialogViewModel2 != null) {
                        List<IMContact> value = shareDialogViewModel2.f128114d.getValue();
                        if (value == null || (list = C89070n.m154567c((List) value, 1)) == null) {
                            list = C89086z.INSTANCE;
                        }
                        shareDialogViewModel2.mo93015b(list);
                    }
                    return true;
                }
            }
        });
        editText.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead.View$OnTouchListenerC553132 */

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f126475a;

            static {
                Covode.recordClassIndex(65076);
            }

            {
                this.f126475a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C89219l.m154716b(motionEvent, "");
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                C55059b.m100693b("share");
                this.f126475a.f126469a.requestFocus();
                KeyboardUtils.m70896b(this.f126475a.f126469a);
                return false;
            }
        });
        editText.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead.View$OnClickListenerC553143 */

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f126476a;

            static {
                Covode.recordClassIndex(65077);
            }

            {
                this.f126476a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = this.f126476a.f126472d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        });
        editText.addTextChangedListener(new TextWatcher(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead.C553154 */

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f126477a;

            static {
                Covode.recordClassIndex(65078);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C89219l.m154721d(charSequence, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f126477a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                String str;
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    ShareDialogViewModel shareDialogViewModel = this.f126477a.f126471c;
                    if (shareDialogViewModel != null) {
                        shareDialogViewModel.mo93014a(0);
                    }
                    ShareDialogViewModel shareDialogViewModel2 = this.f126477a.f126471c;
                    if (shareDialogViewModel2 != null) {
                        shareDialogViewModel2.mo93018d();
                        return;
                    }
                    return;
                }
                ShareDialogViewModel shareDialogViewModel3 = this.f126477a.f126471c;
                if (shareDialogViewModel3 != null) {
                    shareDialogViewModel3.mo93014a(1);
                }
                ShareDialogViewModel shareDialogViewModel4 = this.f126477a.f126471c;
                if (shareDialogViewModel4 != null) {
                    C89219l.m154721d(str, "");
                    shareDialogViewModel4.f128119i.mo92829a(str);
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C89219l.m154721d(charSequence, "");
                if (!TextUtils.isEmpty(charSequence) && this.f126477a.f126470b.getVisibility() == 8) {
                    this.f126477a.f126470b.setVisibility(0);
                } else if (TextUtils.isEmpty(charSequence) && this.f126477a.f126470b.getVisibility() == 0) {
                    this.f126477a.f126470b.setVisibility(8);
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead.View$OnClickListenerC553165 */

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f126478a;

            static {
                Covode.recordClassIndex(65079);
            }

            {
                this.f126478a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f126478a.f126469a.setText("");
            }
        });
        MethodCollector.m26664o(4544);
    }
}
