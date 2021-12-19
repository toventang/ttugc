package com.p2082ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.filter.FindContourInfo */
public class FindContourInfo {
    public List<ContourItem> contourItemsList = new ArrayList();
    public int mContourItemSize;
    public int mHeight;
    public String mInteractId;
    public int mSize;
    public int mWidth;

    /* renamed from: com.ss.avframework.livestreamv2.filter.FindContourInfo$ContourItem */
    public static class ContourItem {
        public int counts;
        public List<ContourPoint> pointsList = new ArrayList();

        static {
            Covode.recordClassIndex(100532);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FindContourInfo$ContourPoint */
    public static class ContourPoint {

        /* renamed from: x */
        public int f191995x;

        /* renamed from: y */
        public int f191996y;

        static {
            Covode.recordClassIndex(100533);
        }
    }

    static {
        Covode.recordClassIndex(100531);
    }
}
