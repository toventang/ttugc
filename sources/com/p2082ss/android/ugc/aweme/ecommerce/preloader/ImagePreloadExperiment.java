package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import android.util.SparseIntArray;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44775e;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44777f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment */
public final class ImagePreloadExperiment {
    private static final int BIT_PDP_DETAIL = 4;
    private static final int BIT_PDP_HEADER = 2;
    private static final int BIT_SKU = 1;
    public static final ImagePreloadExperiment INSTANCE = new ImagePreloadExperiment();
    public static final ImagePreloadConfig NONE = new ImagePreloadConfig();
    private static final int PRIORITY_DEFAULT = 100000;
    private static final int PRIORITY_START = 10;
    private static final int PRIORITY_STEP = 1000;
    private static final AbstractC89244h config$delegate = C89250i.m154773a((AbstractC89171a) C45083a.f105124a);
    private static final AbstractC89244h options$delegate = C89250i.m154773a((AbstractC89171a) C45084b.f105125a);
    private static final AbstractC89244h priorities$delegate = C89250i.m154773a((AbstractC89171a) C45085c.f105126a);

    private final List<Integer> getOptions() {
        return (List) options$delegate.getValue();
    }

    private final SparseIntArray getPriorities() {
        return (SparseIntArray) priorities$delegate.getValue();
    }

    public final ImagePreloadConfig getConfig() {
        return (ImagePreloadConfig) config$delegate.getValue();
    }

    private ImagePreloadExperiment() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment$a */
    static final class C45083a extends AbstractC89220m implements AbstractC89171a<ImagePreloadConfig> {

        /* renamed from: a */
        public static final C45083a f105124a = new C45083a();

        static {
            Covode.recordClassIndex(53512);
        }

        C45083a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImagePreloadConfig invoke() {
            Object a = C16048b.m29633a().mo25416a(true, "ecom_schema_image_prefetch_config", ImagePreloadConfig.class, ImagePreloadExperiment.NONE);
            if (a != null) {
                return a;
            }
            ImagePreloadExperiment imagePreloadExperiment = ImagePreloadExperiment.INSTANCE;
            return ImagePreloadExperiment.NONE;
        }
    }

    static {
        Covode.recordClassIndex(53511);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment$b */
    static final class C45084b extends AbstractC89220m implements AbstractC89171a<List<? extends Integer>> {

        /* renamed from: a */
        public static final C45084b f105125a = new C45084b();

        static {
            Covode.recordClassIndex(53513);
        }

        C45084b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends Integer> invoke() {
            List b = C89070n.m154522b(1, 2, 4);
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if ((((Number) obj).intValue() & ImagePreloadExperiment.INSTANCE.getConfig().f105123b) != 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment$c */
    static final class C45085c extends AbstractC89220m implements AbstractC89171a<SparseIntArray> {

        /* renamed from: a */
        public static final C45085c f105126a = new C45085c();

        static {
            Covode.recordClassIndex(53514);
        }

        C45085c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SparseIntArray invoke() {
            SparseIntArray sparseIntArray = new SparseIntArray();
            List<Number> c = C89070n.m154524c(1, 2, 4);
            Iterator<T> it = ImagePreloadExperiment.INSTANCE.getConfig().f105122a.iterator();
            int i = 10;
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                c.remove(Integer.valueOf(intValue));
                sparseIntArray.put(intValue, i);
                i += ImagePreloadExperiment.PRIORITY_STEP;
            }
            for (Number number : c) {
                sparseIntArray.put(number.intValue(), i);
            }
            return sparseIntArray;
        }
    }

    public final void onFirstHeaderImageReady(AbstractC1196i iVar, PdpViewModel pdpViewModel) {
        List<SaleProp> list;
        C20714a thumbFirstImageUrlModel;
        ProductBase productBase;
        List<Image> list2;
        List<Object> c;
        ProductPackStruct productPackStruct;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(pdpViewModel, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getOptions().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 1) {
                ProductPackStruct productPackStruct2 = pdpViewModel.f104150d;
                if (!(productPackStruct2 == null || (list = productPackStruct2.f104678f) == null)) {
                    ArrayList<SaleProp> arrayList2 = new ArrayList();
                    for (T t : list) {
                        if (C89219l.m154714a((Object) t.f105848c, (Object) true)) {
                            arrayList2.add(t);
                        }
                    }
                    for (SaleProp saleProp : arrayList2) {
                        List<SalePropValue> list3 = saleProp.f105849d;
                        if (list3 != null) {
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                Image image = it2.next().f105852c;
                                if (!(image == null || (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) == null)) {
                                    arrayList.addAll(thumbFirstImageUrlModel.f48941a);
                                }
                            }
                        }
                    }
                }
            } else if (intValue == 2) {
                ProductPackStruct productPackStruct3 = pdpViewModel.f104150d;
                if (!(productPackStruct3 == null || (productBase = productPackStruct3.f104677e) == null || (list2 = productBase.f104660d) == null || (c = C89070n.m154566c((Iterable) list2, 2)) == null)) {
                    for (Object obj : c) {
                        arrayList.add(obj);
                    }
                }
            } else if (intValue == 4 && (productPackStruct = pdpViewModel.f104150d) != null) {
                for (T t2 : C44775e.m87497a(productPackStruct, true)) {
                    if (t2 instanceof C44777f) {
                        arrayList.add(t2.f104467a);
                    }
                }
            }
            if (true ^ arrayList.isEmpty()) {
                C45096d.m87746a(iVar).mo76192a(arrayList, INSTANCE.getPriorities().get(intValue, PRIORITY_DEFAULT));
                arrayList.clear();
            }
        }
    }
}
