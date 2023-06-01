package ir.kaaveh.data.repository.mapper

import ir.kaaveh.domain.test.notFavoriteNews
import ir.kaaveh.data.mapper.toLocalNewsDto
import ir.kaaveh.data.mapper.toNews
import ir.kaaveh.localdatasource.test.localMarketDto
import org.junit.Assert.assertEquals
import org.junit.Test

class LocalNewsDtoMapperTest {

    @Test
    fun localNewsDtoToNews() {
        val mappedNews = localMarketDto.toNews()
        assertEquals(mappedNews, notFavoriteNews)
    }

    @Test
    fun newsToLocalNewsDto() {
        val mappedLocalNews = notFavoriteNews.toLocalNewsDto()
        assertEquals(mappedLocalNews, localMarketDto)
    }
}