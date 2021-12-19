package com.p2082ss.android.ugc.aweme.view.p4230b;

import android.util.SparseArray;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.slider.TuxSlider;
import com.p2082ss.android.ugc.aweme.common.C39219x;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.C60152l;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.b.b */
public final class C81154b extends AbstractC81172f implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: c */
    public static final C81155a f181349c = new C81155a((byte) 0);

    /* renamed from: a */
    public AbstractC60142d f181350a;

    /* renamed from: b */
    public C60152l f181351b;

    /* renamed from: d */
    private int f181352d;

    /* renamed from: e */
    private SparseArray f181353e;

    static {
        Covode.recordClassIndex(94482);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: a */
    public final int mo124609a() {
        return R.layout.aot;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: a */
    public final View mo124610a(int i) {
        if (this.f181353e == null) {
            this.f181353e = new SparseArray();
        }
        View view = (View) this.f181353e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181353e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: c */
    public final void mo124612c() {
        SparseArray sparseArray = this.f181353e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124612c();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.b$a */
    public static final class C81155a {
        static {
            Covode.recordClassIndex(94483);
        }

        private C81155a() {
        }

        public /* synthetic */ C81155a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: b */
    public final void mo124611b() {
        if (this.f181351b != null) {
            AbstractC60142d dVar = this.f181350a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            HashMap<String, C60152l> f = dVar.mo97820f();
            C60152l lVar = this.f181351b;
            if (lVar == null) {
                C89219l.m154715b();
            }
            if (!f.containsKey(lVar.f137116b)) {
                AbstractC60142d dVar2 = this.f181350a;
                if (dVar2 == null) {
                    C89219l.m154715b();
                }
                HashMap<String, C60152l> f2 = dVar2.mo97820f();
                C60152l lVar2 = this.f181351b;
                if (lVar2 == null) {
                    C89219l.m154715b();
                }
                C60152l lVar3 = f2.get(lVar2.f137116b);
                if (lVar3 == null) {
                    C89219l.m154715b();
                }
                C60152l lVar4 = lVar3;
                C60152l lVar5 = this.f181351b;
                if (lVar5 == null) {
                    C89219l.m154715b();
                }
                lVar4.f137115a = lVar5.f137120f;
            }
            AbstractC60142d dVar3 = this.f181350a;
            if (dVar3 == null) {
                C89219l.m154715b();
            }
            HashMap<String, C60152l> f3 = dVar3.mo97820f();
            C60152l lVar6 = this.f181351b;
            if (lVar6 == null) {
                C89219l.m154715b();
            }
            C60152l lVar7 = f3.get(lVar6.f137116b);
            if (lVar7 == null) {
                C89219l.m154715b();
            }
            this.f181352d = lVar7.f137115a;
            TuxSlider tuxSlider = (TuxSlider) mo124610a(R.id.d87);
            if (tuxSlider != null) {
                tuxSlider.setOnSeekBarChangeListener(this);
            }
            TuxSlider tuxSlider2 = (TuxSlider) mo124610a(R.id.d87);
            if (tuxSlider2 != null) {
                int i = this.f181352d;
                C60152l lVar8 = this.f181351b;
                if (lVar8 == null) {
                    C89219l.m154715b();
                }
                float f4 = (float) (i - lVar8.f137118d);
                C60152l lVar9 = this.f181351b;
                if (lVar9 == null) {
                    C89219l.m154715b();
                }
                int i2 = lVar9.f137119e;
                C60152l lVar10 = this.f181351b;
                if (lVar10 == null) {
                    C89219l.m154715b();
                }
                tuxSlider2.setProgress((int) ((f4 / ((float) (i2 - lVar10.f137118d))) * 100.0f));
            }
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C60152l lVar = this.f181351b;
        if (lVar != null) {
            float f = (float) lVar.f137118d;
            C60152l lVar2 = this.f181351b;
            if (lVar2 == null) {
                C89219l.m154715b();
            }
            int i2 = lVar2.f137119e;
            C60152l lVar3 = this.f181351b;
            if (lVar3 == null) {
                C89219l.m154715b();
            }
            int i3 = (int) (f + (((float) ((i2 - lVar3.f137118d) * i)) / 100.0f));
            C60152l lVar4 = this.f181351b;
            if (lVar4 == null) {
                C89219l.m154715b();
            }
            this.f181352d = i3 - (i3 % lVar4.f137121g);
            ProfileNaviEditorViewModel d = mo124635d();
            C60152l lVar5 = this.f181351b;
            if (lVar5 == null) {
                C89219l.m154715b();
            }
            String str = lVar5.f137116b;
            int i4 = this.f181352d;
            C89219l.m154721d(str, "");
            C39219x editCategory = ((ProfileNaviEditorState) d.aB_()).getEditCategory();
            if (editCategory != null) {
                editCategory.f92638a.put(str, Integer.valueOf(i4));
                d.mo33690d(new ProfileNaviEditorViewModel.C81349w(d, i4, str));
            }
        }
    }
}
