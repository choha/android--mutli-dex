package com.multi.option;import android.text.TextUtils;/** *  * dex源文件描述 *  * @author shehonghao *  */public class DexPath {    /**     * 原dex文件所在路径     */    private String srcDexPatch;    /**     * 原dex文件是否在assent目录中     */    private boolean isAssent = true;    public DexPath(String _srcDexPath, boolean isAssent) {        this.srcDexPatch = _srcDexPath;        this.isAssent = isAssent;    }            /**     * @return the srcDexPatch     */    public String getSrcDexPatch() {        return srcDexPatch;    }    /**     * @param srcDexPatch the srcDexPatch to set     */    public void setSrcDexPatch(String srcDexPatch) {        this.srcDexPatch = srcDexPatch;    }    /**     * @return the isAssent     */    public boolean isAssent() {        return isAssent;    }    /**     * @param isAssent the isAssent to set     */    public void setAssent(boolean isAssent) {        this.isAssent = isAssent;    }    public boolean isEmpty() {        return TextUtils.isEmpty(srcDexPatch);    }}