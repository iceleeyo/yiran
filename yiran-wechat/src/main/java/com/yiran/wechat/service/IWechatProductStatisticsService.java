package com.yiran.wechat.service;

import com.yiran.wechat.domain.WechatProductStatistics;
import java.util.List;

/**
 * 商品统计 服务层
 * 
 * @author yiran
 * @date 2019-06-13
 */
public interface IWechatProductStatisticsService 
{
	/**
     * 查询商品统计信息
     * 
     * @param productId 商品统计ID
     * @return 商品统计信息
     */
	public WechatProductStatistics selectWechatProductStatisticsById(Integer productId);
	
	/**
     * 查询商品统计列表
     * 
     * @param wechatProductStatistics 商品统计信息
     * @return 商品统计集合
     */
	public List<WechatProductStatistics> selectWechatProductStatisticsList(WechatProductStatistics wechatProductStatistics);
	
	/**
     * 新增商品统计
     * 
     * @param wechatProductStatistics 商品统计信息
     * @return 结果
     */
	public int insertWechatProductStatistics(WechatProductStatistics wechatProductStatistics);
	
	/**
     * 修改商品统计
     * 
     * @param wechatProductStatistics 商品统计信息
     * @return 结果
     */
	public int updateWechatProductStatistics(WechatProductStatistics wechatProductStatistics);
		
	/**
     * 删除商品统计信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteWechatProductStatisticsByIds(String ids);
	
}
