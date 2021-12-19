package com.p2082ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.livestreamv2.filter.FindContourInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.utils.ZlibCompressUtils */
public class ZlibCompressUtils {
    private static String SEI_HEAD_APP_DATA = "APDT";
    private static String SEI_HEAD_MATTING_DATA = "MATN";
    private static String TAG = "ZlibCompressUtils";

    static {
        Covode.recordClassIndex(100639);
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] compress(byte[] bArr) {
        MethodCollector.m26663i(1739);
        if (bArr == null) {
            MethodCollector.m26664o(1739);
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        MethodCollector.m26664o(1739);
        return byteArray;
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static byte[] unCompress(byte[] bArr) {
        MethodCollector.m26663i(1742);
        if (bArr == null) {
            MethodCollector.m26664o(1742);
            return null;
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        byte[] bArr2 = new byte[4096];
        while (!inflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        MethodCollector.m26664o(1742);
        return byteArray;
    }

    public static FindContourInfo getContourInfoFromString(String str) {
        String str2;
        String str3;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data")) {
                str2 = jSONObject.getString("data");
            } else {
                str2 = "";
            }
            if (jSONObject.has("interact_id")) {
                str3 = jSONObject.getString("interact_id");
            } else {
                str3 = "";
            }
            if (str2 == "") {
                return null;
            }
            byte[] hexStringToBytes = hexStringToBytes(str2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(hexStringToBytes.length);
            allocateDirect.put(hexStringToBytes);
            allocateDirect.position(0);
            FindContourInfo contourInfoFromByteBuffer = getContourInfoFromByteBuffer(allocateDirect);
            if (contourInfoFromByteBuffer != null) {
                contourInfoFromByteBuffer.mInteractId = str3;
            }
            return contourInfoFromByteBuffer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static FindContourInfo getContourInfoFromByteBuffer(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        if (remaining < 4) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        int i3 = 0;
        do {
            bArr2[i3] = bArr[i3];
            i3++;
        } while (i3 < 4);
        String str = new String(bArr2);
        if (!(str.equals(SEI_HEAD_APP_DATA) || str.equals(SEI_HEAD_MATTING_DATA))) {
            return null;
        }
        int i4 = remaining - 4;
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = bArr[i5 + 4];
        }
        byte[] bArr4 = new byte[4096];
        try {
            bArr4 = unCompress(bArr3);
        } catch (DataFormatException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bArr4.length).order(ByteOrder.nativeOrder());
        order.put(bArr4);
        order.flip();
        FindContourInfo findContourInfo = new FindContourInfo();
        int i6 = order.get() & 255;
        if (i6 == 0) {
            return null;
        }
        int i7 = order.get() & 255;
        int i8 = order.get() & 255;
        int i9 = order.get() & 255;
        findContourInfo.mSize = i6;
        findContourInfo.mWidth = i7;
        findContourInfo.mHeight = i8;
        findContourInfo.mContourItemSize = i9;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = order.getShort() & 65535;
            FindContourInfo.ContourItem contourItem = new FindContourInfo.ContourItem();
            contourItem.counts = i11;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                if (i14 == 0) {
                    i = order.getShort() & 255;
                    i2 = order.getShort() & 255;
                } else {
                    i = order.getShort();
                    i2 = order.getShort();
                }
                FindContourInfo.ContourPoint contourPoint = new FindContourInfo.ContourPoint();
                if (i14 == 0) {
                    i12 = i;
                    i13 = i2;
                } else {
                    i12 += i;
                    i13 += i2;
                }
                contourPoint.f191995x = i12;
                contourPoint.f191996y = i13;
                contourItem.pointsList.add(contourPoint);
            }
            findContourInfo.contourItemsList.add(contourItem);
        }
        return findContourInfo;
    }
}
