package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseBodyArray {
    private final JSONArray jsonArray;
    private int statusCode;

    static {
        Covode.recordClassIndex(33960);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int length() {
        return this.jsonArray.length();
    }

    public String toString() {
        return this.jsonArray.toString();
    }

    public Boolean getBoolean(int i) {
        try {
            return (Boolean) getOrThrow(i);
        } catch (Exception e) {
            throw new ResponseBody.ResponseBodyException(e);
        }
    }

    public String getString(int i) {
        try {
            return (String) getOrThrow(i);
        } catch (Exception e) {
            throw new ResponseBody.ResponseBodyException(e);
        }
    }

    public ResponseBodyArray(JSONArray jSONArray) {
        if (jSONArray != null) {
            this.jsonArray = jSONArray;
            return;
        }
        throw new ResponseBody.ResponseBodyException("Cannot instantiate ResponseBodyArray with null json array.");
    }

    private Object getOrThrow(int i) {
        Object obj;
        try {
            obj = this.jsonArray.get(i);
        } catch (JSONException unused) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    public ResponseBody getBody(int i) {
        try {
            return new ResponseBody((JSONObject) getOrThrow(i));
        } catch (ResponseBody.ResponseBodyException e) {
            throw e;
        } catch (Exception e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }

    public int getInt(int i) {
        try {
            return ((Integer) getOrThrow(i)).intValue();
        } catch (Exception e) {
            throw new ResponseBody.ResponseBodyException(e);
        }
    }

    public static <T> List<T> toList(ResponseBodyArray responseBodyArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < responseBodyArray.length(); i++) {
            Object orThrow = responseBodyArray.getOrThrow(i);
            if (orThrow instanceof JSONArray) {
                orThrow = toList(new ResponseBodyArray((JSONArray) orThrow));
            } else if (orThrow instanceof JSONObject) {
                orThrow = ResponseBody.toMap(new ResponseBody((JSONObject) orThrow));
            }
            arrayList.add(orThrow);
        }
        return arrayList;
    }

    public long getLong(int i) {
        try {
            Object orThrow = getOrThrow(i);
            if (orThrow instanceof Integer) {
                return (long) ((Integer) orThrow).intValue();
            }
            if (orThrow instanceof Long) {
                return ((Long) orThrow).longValue();
            }
            throw new ResponseBody.ResponseBodyException();
        } catch (Exception e) {
            throw new ResponseBody.ResponseBodyException(e);
        }
    }

    public ResponseBodyArray(int i, JSONArray jSONArray) {
        this.statusCode = i;
        if (jSONArray != null) {
            this.jsonArray = jSONArray;
            return;
        }
        throw new ResponseBody.ResponseBodyException();
    }

    public ResponseBodyArray(int i, byte[] bArr) {
        this.statusCode = i;
        if (bArr != null) {
            try {
                this.jsonArray = new JSONArray(new String(bArr));
            } catch (JSONException e) {
                throw new ResponseBody.ResponseBodyException(e);
            }
        } else {
            throw new ResponseBody.ResponseBodyException();
        }
    }
}
