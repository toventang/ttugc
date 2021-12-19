package com.p2082ss.android.ugc.aweme.sticker.text;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63231bo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C72452n;
import com.p2082ss.android.ugc.aweme.story.p4047g.C77261a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout */
public class WikiTextStickerInputLayout extends C46224i {
    static {
        Covode.recordClassIndex(88827);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    /* renamed from: e */
    public final void mo78495e() {
        boolean a = C63253l.f143623a.mo73304C().mo93888a();
        if (C63244g.m114602a().mo73255A().mo93901a() || !a || C70005cr.m123611a().f156494n.booleanValue() || C72452n.f162431a) {
            this.f107715v.setVisibility(8);
        } else {
            this.f107715v.setVisibility(0);
        }
        this.f107715v.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.View$OnClickListenerC758881 */

            static {
                Covode.recordClassIndex(88828);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (WikiTextStickerInputLayout.this.f107683F + WikiTextStickerInputLayout.this.f107682E.size() >= 100) {
                    new C79459a(WikiTextStickerInputLayout.this.getContext()).mo123050a(R.string.b1u).mo123053a();
                } else if (WikiTextStickerInputLayout.this.f107682E.size() >= 10) {
                    new C79459a(WikiTextStickerInputLayout.this.getContext()).mo123050a(R.string.b1t).mo123053a();
                } else {
                    if (WikiTextStickerInputLayout.this.f107681D != null) {
                        WikiTextStickerInputLayout.this.f107681D.mo77583b();
                    }
                    if (WikiTextStickerInputLayout.this.f107680C != null) {
                        WikiTextStickerInputLayout.this.f107680C.mo77239a();
                    }
                    WikiTextStickerInputLayout.this.f107715v.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.View$OnClickListenerC758881.RunnableC758891 */

                        static {
                            Covode.recordClassIndex(88829);
                        }

                        public final void run() {
                            C63253l.f143623a.mo73304C().mo93887a(new AbstractC63231bo() {
                                /* class com.p2082ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.View$OnClickListenerC758881.RunnableC758891.C758901 */

                                static {
                                    Covode.recordClassIndex(88830);
                                }

                                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63231bo
                                /* renamed from: a */
                                public final void mo101714a(final C39053a aVar) {
                                    C63253l.f143623a.mo73304C().mo93889b(this);
                                    WikiTextStickerInputLayout.this.f107715v.postDelayed(new Runnable() {
                                        /* class com.p2082ss.android.ugc.aweme.sticker.text.WikiTextStickerInputLayout.View$OnClickListenerC758881.RunnableC758891.C758901.RunnableC758911 */

                                        static {
                                            Covode.recordClassIndex(88831);
                                        }

                                        public final void run() {
                                            String str;
                                            WikiTextStickerInputLayout.this.f107681D.mo77582a();
                                            if (aVar != null && WikiTextStickerInputLayout.this.f107681D != null) {
                                                String title = aVar.getTitle();
                                                if (!TextUtils.isEmpty(title)) {
                                                    int selectionStart = WikiTextStickerInputLayout.this.f107701h.getSelectionStart();
                                                    String str2 = " _" + title + " ";
                                                    TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = new TextStickerTextUnderlineIndexRange(selectionStart, str2.length() + selectionStart);
                                                    C46110t.m88962a(WikiTextStickerInputLayout.this.f107682E, selectionStart, str2.length());
                                                    WikiTextStickerInputLayout.this.f107682E.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange, C77261a.m135058a(aVar)));
                                                    String str3 = "";
                                                    if (selectionStart > 0) {
                                                        str = WikiTextStickerInputLayout.this.getEditTextStr().substring(0, selectionStart);
                                                    } else {
                                                        str = str3;
                                                    }
                                                    if (selectionStart < WikiTextStickerInputLayout.this.getEditTextStr().length()) {
                                                        str3 = WikiTextStickerInputLayout.this.getEditTextStr().substring(selectionStart);
                                                    }
                                                    WikiTextStickerInputLayout.this.f107701h.mo78447a(str + str2 + str3, selectionStart + str2.length());
                                                }
                                            }
                                        }
                                    }, 500);
                                }
                            });
                            if (WikiTextStickerInputLayout.this.f107680C != null) {
                                C63253l.f143623a.mo73304C().mo93886a(WikiTextStickerInputLayout.this.getContext(), WikiTextStickerInputLayout.this.f107680C.mo77240b());
                            } else {
                                C63253l.f143623a.mo73304C().mo93886a(WikiTextStickerInputLayout.this.getContext(), new HashMap());
                            }
                        }
                    }, 500);
                }
            }
        });
    }

    public WikiTextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
