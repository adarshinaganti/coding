SELECT COUNT(TITLE)
FROM movies
WHERE id IN(
	SELECT movie_id
	FROM ratings
	WHERE rating LIKE "10.0"
)